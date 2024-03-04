package Multi_Class_Communication.Palindrome_Armstrong_Prime;

import java.util.Scanner;

public class Check_Palindrome_Armstrong {
	Scanner s = new Scanner(System.in);
	int a;
	
	public void Check_Palindrome() {
		int rem,No = 0;
		
		System.out.println("\nPalindrome...........");
		
		System.out.print("Enter Number = ");
		a = s.nextInt();
		
		int temp = a;
		
		while(a>0)
		{
			rem = a % 10;
			No = No * 10 + rem;
			
			a = a / 10;
		}
		if(temp == No)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is Not Palindrome");
		}
	}
	
	public void Armstrong() {
		int rem,cnt = 0,ans = 0;
		
		System.out.println("\nArmstrong...........");
		
		System.out.print("Enter Number = ");
		a = s.nextInt();
		
		int temp = a;
		
		while(a>0) {
			rem = a % 10;
			a = a / 10;
			cnt++;
		}
		
		a = temp;
		while(a>0) {
			rem = a % 10;
			a = a / 10;
			ans = ans + ((int)Math.pow(rem, cnt));
		}
		
		if(temp == ans) {
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is Not Armstrong");
		}
	}
}
