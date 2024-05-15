package OOP_Concepts.Polymorphism.Overriding.Employee;

public class HRManager extends Employee{
	public void work() {
		System.out.println("Complete two Project");
	}
	
	public void addEmployee() {
		System.out.println("Add Employee method from HRManager");
	}
}
