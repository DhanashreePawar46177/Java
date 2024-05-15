package OOP_Concepts.Polymorphism.Overloading.Employee;

import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	
	public void  display() {
		System.out.print("Enter Employee Id = ");
		System.out.println("Employee Id = " +sc.nextInt());
		
		System.out.print("Enter Employee Name = ");
		System.out.println("Employee Name = " +sc.next());
	}
	
	public void display(int Id, String Name) {
		System.out.println("Employee Id = " +Id);
		System.out.println("Employee Name = " +Name);
	}
}
