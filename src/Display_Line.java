
import java.util.*;

public class Display_Line 
{
	private ArrayList <display> row;
	
	public Display_Line()
	{
		row=new ArrayList<display>();
	}
	public void add(display s) 
	{
		row.add(s);
	}
	public void printline()
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
		
		System.out.print("\n");
		for(k=0;k<row.size();k++)
		{
			for(i=0;i<row.get(k).getSize();i++)
			{
				row.get(k).segmentF();
				for(j=0;j<row.get(k).getSize();j++)
				{
					System.out.print(" ");
				}
				row.get(k).segmentB();
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		
		for(k=0;k<row.size();k++)
		{
			System.out.print(" ");
			for(i=0;i<row.get(k).getSize();i++)
			{
				row.get(k).segmentG();
			}
			System.out.print("  ");
		}
		
		System.out.print("\n");
		for(k=0;k<row.size();k++)
		{
			for(i=0;i<row.get(k).getSize();i++)
			{
				row.get(k).segmentE();
				for(j=0;j<row.get(k).getSize();j++)
				{
					System.out.print(" ");
				}
				row.get(k).segmentC();
				System.out.print(" ");
			}
			System.out.print("\n");
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
		
		
	}
}
