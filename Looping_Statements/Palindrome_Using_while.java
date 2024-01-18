package Lopping_Statements;

public class Palindrome_Using_while {
	public static void main(String[] args) {
		int a = 1991, rem = 0, No = 0;
		int temp = a;
		
		System.out.println("Number = " +a);
		System.out.print("Reverse = ");
		
		while(a > 0)
		{
			rem = a % 10;
			No = No * 10 + rem;
			
			a = a / 10;
		}
		System.out.println(No);
		
		if(No == temp)
		{
			System.out.println(temp + " is Palindrome.");
		}
		else
		{
			System.out.println(temp + " is not Palindrome.");
		}
	}
}
