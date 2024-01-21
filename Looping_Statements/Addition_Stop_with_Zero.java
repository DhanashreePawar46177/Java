package Lopping_Statements.Calculator;

import java.util.Scanner;

public class Addition_Stop_with_Zero {
	public static void main(String[] args) {
		int no = 0, ans = 0;

		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter Number = ");
			
			no = s.nextInt();
			
			if(no == 0) {
				break;
			}
			
			ans = ans + no;
		}
		
		System.out.println("Addition = " +ans);
	}
}
