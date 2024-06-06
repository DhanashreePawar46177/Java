package Exception_Handling.Custom_Exception.Marriage_Registration;

import java.util.Scanner;

public class Main_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter female Age = ");
		int femaleAge = sc.nextInt();
		
		System.out.println("Enter male Age = ");
		int maleAge = sc.nextInt();
		
		MarriageAgeValidation m = new MarriageAgeValidation();
		m.marriageAgeValidation(femaleAge, maleAge);
	}
}
