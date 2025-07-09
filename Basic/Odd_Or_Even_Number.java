package Basic_Programs;
import java.util.Scanner;

public class Odd_Or_Even_Number {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int no = sc.nextInt();
	
		if(no % 2 == 0) {
			System.out.println(no + " is even number");
		}
		else {
			System.out.println(no + " is odd number");
		}
	}
}
