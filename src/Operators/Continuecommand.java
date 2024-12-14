package Operators;

public class Continuecommand {

	public static void main(String[] args)
	{
		for (int x=1;x<=10;x++)
		{
			if(x==2 || x==5 ||x==10)
			{
				continue;
			}
			System.out.println("Print of x value:"   +x);
		}
	}
}
