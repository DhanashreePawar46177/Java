package Lopping_Statements;

public class Palindrome_Series_Using_while {
	public static void main(String[] args) {
		int i = 1;
		
		while(i <= 1000)
		{
			int a = i ,rem = 0, temp = a , No = 0;
			
			while(a > 0)
			{
				rem = a % 10;
				No = No * 10 + rem;
				a = a / 10;
			}
		
			if(No == temp)
			{
				System.out.println(temp);
			}
			i++;
		}
	}
}
