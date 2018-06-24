import java.lang.String;
import java.util.Scanner;
import java.lang.System;

public class lcd_display_master
{
	
	public static void main(String datain[])
	{
		StringBuilder d1;
		StringBuilder d2;
		Scanner read=new Scanner(System.in);
		String data,data1,data2;
		display disp;
		
		
		do 
		{
			
			d1=new StringBuilder();
			d2=new StringBuilder();
			System.out.println("Ingrese un dato: ");
			data=read.nextLine();
			if(test(data,d1,d2));
			{
				disp=new display(Integer.parseInt(d1.toString()),Integer.parseInt(d2.toString()));
				disp.print();
			}
			System.out.println("data1: "+d1.toString()+", data2: "+d2.toString());//+", n1: "+n1+", n2: "+n2);
		}while(exit(d1.toString(),d2.toString()));
		
		
		
		
	}
	
	public static Boolean test(String data, StringBuilder data1, StringBuilder data2)
	{
		int index, n1,n2;
		CharSequence coma=",";
		
		boolean str = data.contains(coma);
		if (data.length()>=3 && data.contains(coma))
		{
			System.out.println("correcto "+ data+"\n");
			index=data.indexOf(",");
			System.out.println(index+" index\n");
			data1.append(data.substring(0,index));
			data2.append(data.substring(index+1));
			System.out.println(data1+" data1\n");
			System.out.println(data2+" data2\n");
			try
			{
				n1=Integer.parseInt(data1.toString());
				n2=Integer.parseInt(data2.toString());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Debe ingresar numeros");
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
	public static boolean exit(String data1, String data2) 
	{
		Boolean out=true;
		if(Integer.parseInt(data1)==0 && Integer.parseInt(data2)==0)
		{
			out=false;
			System.out.println("out");
		}
		return out;
	}
	
}