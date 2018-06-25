import java.lang.String;
import java.util.Scanner;
import java.lang.System;

public class lcd_display_master
{
	
	public static void main(String datain[])
	{
		StringBuilder d1;						//el dato ingresado es un string que debe
		StringBuilder d2;						//partirse en dos partes para trabajar				
		Scanner read=new Scanner(System.in);	//para obtener datos de teclado
		String data;
		Display_Line fila=new Display_Line();
		String s;
		boolean ext;
		
		do 
		{
			d1=new StringBuilder(); 				//se inicializan los strings y se ingresa el dato
			d2=new StringBuilder();
			System.out.println("Ingrese un dato: ");
			data=read.nextLine();
			if(test(data,d1,d2))					//se verifica que el dato este correcto y se parte en d1 y d2
			{
				
				ext=exit(d1.toString(),d2.toString()); //se verifica si se ingreso la opcion para salir
				if(ext)
				{
					for(int i=0;i<d2.length();i++)
					{
						s=Character.toString(d2.toString().charAt(i)); 									//se convierte cada digito a display
						fila.add(new display(Integer.parseInt(d1.toString()),Integer.parseInt(s))); 	//y se mete en la lista
					}
					fila.printline();		//cuando se han metido todos los datos, se imprime la lista
					System.out.println("\n");
				
					//System.out.println("data1: "+d1.toString()+", data2: "+d2.toString());//+", n1: "+n1+", n2: "+n2);
				}
			}
			else
			{
				ext=true;
			}
			fila.delete(); 				//se borra la lista de displays para evitar errores
		}while(ext);
		
		read.close();
		
		
	}
	
	public static Boolean test(String data, StringBuilder data1, StringBuilder data2)
	{
		int index;
		long n1,n2;
		CharSequence coma=",";
		
		boolean str = data.contains(coma) && data.indexOf(",")>0 && data.indexOf(",")<(data.length()-1) ;
		if (data.length()>=3 && str ) 	//se garantiza que el dato ingresado sea valido 
		{
			//System.out.println("correcto "+ data+"\n");
			index=data.indexOf(",");
			//System.out.println(index+" index\n");
			data1.append(data.substring(0,index));
			data2.append(data.substring(index+1));
			//System.out.println(data1+" data1\n");
			//System.out.println(data2+" data2\n");
			try
			{
				n1=Long.parseLong(data1.toString()); //se garantiza que el dato ingresado sea numerico
				n2=Long.parseLong(data2.toString());
				if(n1>10)
				{
					str=false;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Debe ingresar numeros");
				str=false;
			}
			/*finally
			{
				System.out.println("fin del programa");
			}*/
		}
		else
		{
			System.out.println("ha ingresado un dato incorrecto, intentelo nuevamente");
		}
		
		return str;
	}
	public static boolean exit(String data1, String data2) //se comprueba el criterio de salida del programa (0,0)
	{
		Boolean out=true;
		if(Integer.parseInt(data1)==0 && Integer.parseInt(data2)==0)
		{
			out=false;
			System.out.println("Fin del programa");
		}
		return out;
	}
	
}