package Exception_Handling.Custom_Exception.Voting_Registration;

import java.util.Scanner;

public class Voting_Age_Validation {
	int age;
	public void Validation() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age = ");
		age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You are Eligible for Voting");
		}
		else {
			try {
				throw new CantRegisterException("Can't Register");
			}
			catch(CantRegisterException e){
				System.out.println(e);
				System.out.println("Try after " +(18-age)+ " Years");
			}
		}
		System.out.println("End.....");
	}
}
