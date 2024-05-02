package OOP_Concepts.Inheritance.Hierarchical.Person;

public class Main_Class {
	public static void main(String[] args) {
		Employee e = new Employee(20000f,10);
		e.display();
		
		Student s = new Student(101, 89.9f);
		s.display();
	}
}
