package Lopping_Statements.Calculator;

import java.util.Scanner;

public class Substraction_Stop_with_Zero {
	public static void main(String[] args) {
		int no = 0, ans = 0;

		Scanner s = new Scanner(System.in);
		
		for(int i = 1; true; i++)
		{
			System.out.print("Enter Number = ");
			no = s.nextInt();
			
			if(i == 1) {
				ans = 2 * no;
				//ans = no;
			}
			
			if(no == 0) {
				break;
			}
			else {
				
				ans = ans - no;
			}
			
		}
		
		System.out.println("Substraction = " +ans);
	}
}
