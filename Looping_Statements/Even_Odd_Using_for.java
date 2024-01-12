package Lopping_Statements;

public class Even_Odd_Using_for {
	public static void main(String[] args) {
		System.out.println("Even \tOdd ");
		
		for(int i = 1; i <= 50; i++)
		{
			if(i%2 == 0)
			{
				System.out.println("\t" +i);
			}
			else
			{
				System.out.print(i);
			}
		}
	}
}
