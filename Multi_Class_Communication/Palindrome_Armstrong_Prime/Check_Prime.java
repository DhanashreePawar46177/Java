package Multi_Class_Communication.Palindrome_Armstrong_Prime;

import java.util.Scanner;

public class Check_Prime {
	public void Prime() {
		int a = 0,cnt = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nPrime...........");
		
		System.out.print("Enter Number = ");
		a = s.nextInt();
		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				cnt++;
			}
		}
		
		if(cnt==2) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is Not Prime");
		}
	}
}
