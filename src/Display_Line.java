
import java.util.*;

public class Display_Line  				//clase para agrupar displays de siete segmentos
{
	private ArrayList <display> row; 	//la clase que contendra los displays a mostrar
	
	public Display_Line() 				//constructor
	{
		row=new ArrayList<display>();
	}
	public void add(display s) 			//añadir un display a la fila
	{
		row.add(s);
	}
	public void delete()				//limpiar la lista
	{
		row.clear();
	}
	public void printline()				//imprimir todos los displays de la lista segun el tamaño y el dato a imprimir
	{
	
		int i=0,j=0,k=0;
		
		for(k=0;k<row.size();k++)
		{
			System.out.print(" ");
			for(i=0;i<row.get(k).getSize();i++)
			{
				row.get(k).segmentA();
			}
			System.out.print("  ");
		}
		
		for(i=0;i<row.get(0).getSize();i++)
		{
			System.out.print("\n");
			for(k=0;k<row.size();k++)
			{
				row.get(k).segmentF();
				for(j=0;j<row.get(k).getSize();j++)
				{
					System.out.print(" ");
				}
				row.get(k).segmentB();
				System.out.print(" ");
			}
		}
		
		System.out.print("\n");
		
		for(k=0;k<row.size();k++)
		{
			System.out.print(" ");
			for(i=0;i<row.get(k).getSize();i++)
			{
				row.get(k).segmentG();
			}
			System.out.print("  ");
		}
		
		for(i=0;i<row.get(0).getSize();i++)
		{
			System.out.print("\n");
			for(k=0;k<row.size();k++)
			{
				row.get(k).segmentE();
				for(j=0;j<row.get(k).getSize();j++)
				{
					System.out.print(" ");
				}
				row.get(k).segmentC();
				System.out.print(" ");
			}
		}
		
		System.out.print("\n");
		for(k=0;k<row.size();k++)
		{
			System.out.print(" ");
			for(i=0;i<row.get(k).getSize();i++)
			{
				row.get(k).segmentD();
			}
			System.out.print("  ");
		}
		
		
	}
}
