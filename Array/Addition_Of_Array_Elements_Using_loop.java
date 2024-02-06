package Array;

import java.util.Scanner;

public class Addition_Of_Array_Elements_Using_loop {
	public static void main(String[] args) {
		int a[] = new int[4];
		int add = 0;
		
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<a.length; i++) {
			System.out.println("Enter " +i+ " index element");
			a[i] = s.nextInt();
			
			add = add +a[i];
		}
		
		System.out.println(add);
	}
}
