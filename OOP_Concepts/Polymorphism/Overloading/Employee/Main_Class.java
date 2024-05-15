package OOP_Concepts.Polymorphism.Overloading.Employee;

public class Main_Class {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.display();
		
		System.out.println();
		e.display(10, "Pawar");
	}
}
