import java.lang.System;

public class display
{
	private int size;			 //tama�o de el display
	private int literal;		// el simbolo a mostrar, entre el 0 y el 9
	private Boolean code[];		//variable para asignar que segmentos de recta se imprimiran o no
	public display(int s,int l)
	{
		size=s;
		literal=l;
		encoder();
	}
	
	public int getLiteral() 
	{
		return literal;
	}
	public int getSize()
	{
		return size;
	}
	
	public void encoder() //funcion para cambiar el numero a formato de display de siete segmentos
	{
		int s=getLiteral();
		Boolean codes[]=new Boolean[7];

		switch(s) //decodificador de entero a bcd
		{
			//recordar configuracion de display de siete segmentos(ver en google!): abcdefg
			//true: segmento encendido, false: segmento apagado
			case(0): //segmentos abcdef
				codes[0]=true; //segmento a
				codes[1]=true; //segmento b
				codes[2]=true; //segmento c
				codes[3]=true; //segmento d
				codes[4]=true; //segmento e
				codes[5]=true; //segmento f
				codes[6]=false; //segmento g
			break;

			case(1)://segmentos bc
				codes[0]=false;
				codes[1]=true;
				codes[2]=true;
				codes[3]=false;
				codes[4]=false;
				codes[5]=false;
				codes[6]=false;
			break;
			case(2)://segmentos abdeg
				codes[0]=true;
				codes[1]=true;
				codes[2]=false;
				codes[3]=true;
				codes[4]=true;
				codes[5]=false;
				codes[6]=true;
			break;
			case(3): //segmentos abcdg
				codes[0]=true;
				codes[1]=true;
				codes[2]=true;
				codes[3]=true;
				codes[4]=false;
				codes[5]=false;
				codes[6]=true;
			break;
			case(4): //segmentos bcfg
				codes[0]=false;
				codes[1]=true;
				codes[2]=true;
				codes[3]=false;
				codes[4]=false;
				codes[5]=true;
				codes[6]=true;
			break;
			case(5): //segmentos acdeg
				codes[0]=true;
				codes[1]=false;
				codes[2]=true;
				codes[3]=true;
				codes[4]=false;
				codes[5]=true;
				codes[6]=true;
			break;
			case(6): //segmentos acdefg
				codes[0]=true;
				codes[1]=false;
				codes[2]=true;
				codes[3]=true;
				codes[4]=true;
				codes[5]=true;
				codes[6]=true;
			break;
			case(7): //segmentos abc
				codes[0]=true;
				codes[1]=true;
				codes[2]=true;
				codes[3]=false;
				codes[4]=false;
				codes[5]=false;
				codes[6]=false;
			break;
			case(8): //segmentos abcdefg
				codes[0]=true;
				codes[1]=true;
				codes[2]=true;
				codes[3]=true;
				codes[4]=true;
				codes[5]=true;
				codes[6]=true;
			break;
			case(9): //segmentos abcdfg
				codes[0]=true;
				codes[1]=true;
				codes[2]=true;
				codes[3]=true;
				codes[4]=false;
				codes[5]=true;
				codes[6]=true;
			break;
			default: //todos los segmentos apagados
			 	codes[0]=false;
				codes[1]=false;
				codes[2]=false;
				codes[3]=false;
				codes[4]=false;
				codes[5]=false;
				codes[6]=false;
			break;
		}
		code=codes;
	}
	public void print() //para imprimir solo un display. Solo usado en pruebas
	{
		int i=0,j=0;
		
		System.out.print(" ");
		for(i=0;i<getSize();i++) 	//se imprime cada segmento tantas veces como el tama�o ingresado
		{							//dejando los espacios necesarios para que forme la figura adecuada
			segmentA();
		}
		System.out.print(" ");
		
		for(i=0;i<getSize();i++)
		{
			System.out.print("\n");
			
			segmentF();
			for(j=0;j<getSize();j++)
			{
				System.out.print(" ");
			}
			segmentB();
			
		}
		System.out.print("\n");
		System.out.print(" ");
		for(i=0;i<getSize();i++)
		{
			segmentG();
		}
		System.out.print(" ");
		
		for(i=0;i<getSize();i++)
		{
			System.out.print("\n");
			
			segmentE();
			for(j=0;j<getSize();j++)
			{
				System.out.print(" ");
			}
			segmentC();
			
		}
		System.out.print("\n");
		System.out.print(" ");
		for(i=0;i<getSize();i++)
		{
			
			segmentD();
		}
		System.out.print(" ");
		System.out.print("\n");	
	}
	
	
	
	
	
	
	public void segmentA() //impresion de los simbolos para cada tipo de segmento
	{						//si el segmento esta desactivado se imprime en pantalla un espacio
		if(code[0])
		{
			System.out.print("-");
		}
		else
		{
			System.out.print(" ");
		}
	}
	public void segmentB()
	{
		if(code[1])
		{
			System.out.print("|");
		}
		else
		{
			System.out.print(" ");
		}
	}
	public void segmentC()
	{
		if(code[2])
		{
			System.out.print("|");
		}
		else
		{
			System.out.print(" ");
		}
	}
	public void segmentD()
	{
		if(code[3])
		{
			System.out.print("-");
		}
		else
		{
			System.out.print(" ");
		}
	}
	public void segmentE()
	{
		if(code[4])
		{
			System.out.print("|");
		}
		else
		{
			System.out.print(" ");
		}
	}
	public void segmentF()
	{
		if(code[5])
		{
			System.out.print("|");
		}
		else
		{
			System.out.print(" ");
		}
	}
	public void segmentG()
	{
		if(code[6])
		{
			System.out.print("-");
		}
		else
		{
			System.out.print(" ");
		}
	}

}