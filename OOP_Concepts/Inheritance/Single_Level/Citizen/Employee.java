package OOP_Concepts.Inheritance.Single_Level.Citizen;

public class Employee extends Citizen{
	int eId;
	float salary;
	
	public Employee(int eId, float salary) {
		super("Abc",678902156987l,"Maharashtra");
		this.eId = eId;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Employee Id = " +eId);
		System.out.println("Salary = " +salary);
		System.out.println("Name = " +name);
		System.out.println("Adhar Number = " +adharNo);
		System.out.println("State = " +state);
	}
}
