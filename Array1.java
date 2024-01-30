import java.util.*;

public class Array1
{
	public static void main(String [] args)
	{
		int i=0;
		Scanner a = new Scanner(System.in);
		int [] x = new int [5];
		while(i<x.length)
		{
			System.out.println("x[" + i + "]:");
			x[i] = a.nextInt();
			i++;
		}
		System.out.println("Array data:");
		for(i=0;i<x.length;i++)
			System.out.print("	" + x[i]);
	}
}