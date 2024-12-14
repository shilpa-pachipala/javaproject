package Array;

public class MultidimensionalArray {
	public static void main(String[] args)
	{
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		System.out.println("size of rows :"  +a.length);
		System.out.println("length of columns:"  +a[0].length);
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[0].length;c++)
			{
				System.out.println("values of Rows, columns:" +a[r][c]);
			}
		}
		//or we can write enhanced for loop 
		for(int x[]:a)
		{
			for (int y:x)
			{
				System.out.println(y);
			}
		}
		 
	}
}
