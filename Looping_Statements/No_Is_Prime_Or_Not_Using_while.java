package Lopping_Statements;

public class No_Is_Prime_Or_Not_Using_while {
	public static void main(String[] args) {
		int a = 7, i = 1, Cnt = 0;
		
		while(i <= a)
		{
			if(a % i == 0)
			{
				Cnt++;
			}
			i++;
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
