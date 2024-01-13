package Lopping_Statements;

public class No_Is_Prime_Or_Not_Using_for {
	public static void main(String[] args) {
		int a = 7, Cnt = 0;
		
		for(int i = 1; i <= a; i++)
		{
			if(a%i == 0)
			{
				Cnt++;
			}
		}
		
		if(Cnt == 2)
		{
			System.out.println(a + " is Prime.");
		}
		else
		{
			System.out.println(a + " is Not Prime.");
		}
	}
}
