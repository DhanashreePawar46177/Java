package Lopping_Statements;

public class Double_Reverse_Using_while {
	public static void main(String[] args) {
		int a = 1987, rem = 0, No = 0;
		
		System.out.println("Number = " +a);
		
		while(a > 0)
		{
			rem = a % 10;
			No = (No * 10) + rem;
			a = a / 10;
		}
		System.out.println("Reverse = " +No);
	}
}
