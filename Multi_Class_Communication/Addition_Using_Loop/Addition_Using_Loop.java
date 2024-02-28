package Multi_Class_Communication.Addition_Using_Loop;

import java.util.Scanner;

public class Addition_Using_Loop {	
	public void Addition() {
		int no = 0, ans = 0;

		Scanner s = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.print("Enter " + i + " Number = ");
			
			no = s.nextInt();
			
			ans = ans + no;
		}
		
		System.out.println("Addition = " +ans);
	}
}
