package Multi_Class_Communication.User_Input_Addition;

import java.util.Scanner;

public class User_Input_Add {
	int a ;
	int b;
	public void User_Input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter 1st Number = ");
		a = s.nextInt();
		
		System.out.print("Enter 2nd Number = ");
		b = s.nextInt();
		
		Addition();
	}
	
	public void Addition() {
		System.out.println("Addition = " +(a+b));
	}
}
