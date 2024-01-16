package Lopping_Statements;

public class Separate_the_Digits_Using_while {
	public static void main(String[] args) {
		int a = 1987, rem = 0;
		
		System.out.println("Number = " +a);
		System.out.print("Digits = ");
		
		while(a > 0)
		{
			rem = a % 10;
			System.out.print(rem);
			
			a = a / 10;
		}
	}
}
