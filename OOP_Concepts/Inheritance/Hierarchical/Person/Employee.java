package OOP_Concepts.Inheritance.Hierarchical.Person;

public class Employee extends Person{
	float salary;
	int id;
	
	public Employee(float salary, int id){
		super("Dhanashree",28);
		this.salary = salary;
		this.id = id;
	}
	
	public void display() {
		Display();
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Id : "+id);
	}
}
