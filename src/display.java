import java.lang.System;

public class display
{
	private int size;
	private int literal;
	private Boolean code[];
	public display(int s,int l)
	{
		size=s;
		literal=l;
		encoder();
	}
	public void encoder()
	{
		int s=getLiteral();
		Boolean codes[]=new Boolean[7];

		switch(s)
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
	public void print()
	{
		int i=0,j=0;
		
		System.out.print(" ");
		for(i=0;i<getSize();i++)
		{
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
	
	public void segmentA()
	{
		if(code[0])
		{
			System.out.print("-");
		}
	}
	public void segmentB()
	{
		if(code[1])
		{
			System.out.print("|");
		}
	}
	public void segmentC()
	{
		if(code[2])
		{
			System.out.print("|");
		}
	}
	public void segmentD()
	{
		if(code[3])
		{
			System.out.print("-");
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
	}
	public int getLiteral()
	{
		return literal;
	}
	public int getSize()
	{
		return size;
	}
}