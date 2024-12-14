package Array;

public class OneDimensionalArray {
	public static void main(String[] args) {
		
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		System.out.println("size of the string:"   +a.length); //length = a.length
		System.out.println("specific value of 2nd value a :"  +a[2]); //a[2]
		for(int x:a)
		{
			System.out.println("all values of array:"   +x);
		}
		
	}
	
	
			

}
