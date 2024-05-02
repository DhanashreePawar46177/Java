package OOP_Concepts.Inheritance.Hierarchical.Person;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Display() {
		System.out.println("Person Name : "+name);
		System.out.println("Person Age : "+age);
	}
}
