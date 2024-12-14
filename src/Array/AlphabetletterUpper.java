package Array;

public class AlphabetletterUpper {

	public static void main(String[] args) {
		System.out.println("Alphabets in Uppercase");
		
		for (char ch='A' ;ch<='Z'; ch++)
		{
			System.out.print(" ");
			System.out.print(ch+"  ");
		}
		
		System.out.println("    Alphabets in lowercase");
		{
			for (char ch='a';ch<='z';ch++)
			{
				System.out.print(" ");
				System.out.print(ch+"  ");
			}
		}

	}

}
