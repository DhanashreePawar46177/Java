package Array;

import java.util.Scanner;

public class Insert_Elements_From_User {
	public static void main(String[] args) {
		int a[] = new int[4];
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 0th index Element");
		a[0] = s.nextInt();
		
		System.out.println("Enter 1st index Element");
		a[1] = s.nextInt();
		
		System.out.println("Enter 2nd index Element");
		a[2] = s.nextInt();
		
		System.out.println("Enter 3rd index Element");
		a[3] = s.nextInt();
	}
}
