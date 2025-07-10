package Basic_Programs;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int no = sc.nextInt();
		
		if(isPrime(no)) {
			System.out.println(no + " is a prime number.");
		}
		else {
			System.out.println(no + " is not a prime number.");
		}
	}
	public static boolean isPrime(int num) {
		for(int i = 2 ; i <= num/2 ; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
