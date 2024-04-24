package OOP_Concepts.Inheritance.Single_Level.Person;

public class Employee extends Person{
	int id;
	float salary;
	
	public Employee(int id, float salary) {
		this.id = id;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Id = " +id);
		System.out.println("Salary = " +salary);
	}
}
