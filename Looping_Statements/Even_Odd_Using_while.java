package Lopping_Statements;

public class Even_Odd_Using_while {
	public static void main(String[] args) {
		System.out.println("Even \tOdd ");
		
		int i = 1;
		while( i <= 50)
		{
			if(i%2 == 0)
			{
				System.out.println("\t" +i);
			}
			else
			{
				System.out.print(i);
			}
			i++;
		}
	}
}
