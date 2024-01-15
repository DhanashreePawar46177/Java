package Lopping_Statements;

public class Reverse_No_Using_while {
	public static void main(String[] args) {
		int a = 1987, rem = 0, No = 0;
		
		System.out.println("Number = " +a);
		System.out.println("Reverse = ");
		
		while(a > 0)
		{
			rem = a % 10;
			No = (No * 10) + rem;
			System.out.println(rem);
			a = a / 10;
		}
		System.out.println(No);
	}
}
