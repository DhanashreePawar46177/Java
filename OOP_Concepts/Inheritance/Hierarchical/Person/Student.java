package OOP_Concepts.Inheritance.Hierarchical.Person;

public class Student extends Person{
	int id;
	float per;
	
	public Student(int id, float per) {
		super("Dhanu", 21);
		this.id = id;
		this.per = per;
	}
	
	public void display() {
		Display();
		System.out.println("Student Id :"+id);
		System.out.println("Student Percentage :"+per);
	}
}
