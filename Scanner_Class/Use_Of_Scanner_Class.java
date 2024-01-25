package Scanner_Class;

import java.util.Scanner;

public class Use_Of_Scanner_Class {
	public void add() {
		int a;
		int b;
		
		Scanner S = new Scanner(System.in);
		System.out.print("Enter a = ");
		a = S.nextInt();
		
		System.out.print("Enter b = ");
		b = S.nextInt();
		
		int c = a + b;
		
		System.out.println("Addition is = " +c);
	}
	
	public static void main(String[] args) {
		Use_Of_Scanner_Class Obj = new Use_Of_Scanner_Class();
		Obj.add();
	}
}
