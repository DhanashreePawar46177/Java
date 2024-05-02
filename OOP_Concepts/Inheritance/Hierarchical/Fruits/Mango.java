package OOP_Concepts.Inheritance.Hierarchical.Fruits;

public class Mango extends Fruits{
	String taste;
	String location;
	
	public Mango(String taste, String location) {
		super("Mango", "Green");
		this.taste = taste;
		this.location = location;
	}
	
	public void display() {
		System.out.println("Name = " +name);
		System.out.println("Color of Mango = " +color);
		System.out.println("Taste of Mango = " +taste);
		System.out.println("Location of Mango = " +location);
	}
}
