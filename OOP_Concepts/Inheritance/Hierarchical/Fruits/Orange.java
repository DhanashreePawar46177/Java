package OOP_Concepts.Inheritance.Hierarchical.Fruits;

public class Orange extends Fruits{
	String taste;
	String location;
	
	public Orange(String taste, String location) {
		super("Orange", "Orange");
		this.taste = taste;
		this.location = location;
	}
	
	public void display() {
		System.out.println("Name = " +name);
		System.out.println("Color of Orange = " +color);
		System.out.println("Taste of Orange = " +taste);
		System.out.println("Location of Orange = " +location);
	}
}
