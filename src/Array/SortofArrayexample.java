package Array;

import java.util.Arrays;

public class SortofArrayexample {
	

	public static void main(String[] args)
	{
		int a[]=new int[5];
		a[0]=25;
		a[1]=14;
		a[2]=18;
		a[3]=30;
		a[4]=10;
	
		Arrays.sort(a); //ascending order
		System.out.println("print values in ascending order");
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println("print values in ascending order:"  +a[i]);	
		} */
		for( int x:a)
		{
			System.out.println(x);
		}
		
		
	}


}
