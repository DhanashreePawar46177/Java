package Lopping_Statements;

public class Count_Of_Digits_Using_while {
	public static void main(String[] args) {
		int a = 1987, Cnt = 0;
		
		System.out.println("Number = " +a);
		
		while(a > 0)
		{
			a = a / 10;
			Cnt++;
		}
		System.out.println(Cnt);
	}
}
