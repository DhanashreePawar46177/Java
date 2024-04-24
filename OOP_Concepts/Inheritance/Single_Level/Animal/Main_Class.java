package OOP_Concepts.Inheritance.Single_Level.Animal;

import java.util.Scanner;

public class Main_Class {
	public static void main(String[] args) {
		Animal a = new  Animal("Abc", "Xyz");
		Dog d = new Dog(1,"Pqr");
		Scanner sc = new Scanner(System.in);
		sc.next();
		d.display();
	}
}
