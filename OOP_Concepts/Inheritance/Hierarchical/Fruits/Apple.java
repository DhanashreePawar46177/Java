package OOP_Concepts.Inheritance.Hierarchical.Fruits;

public class Apple extends Fruits{
	String taste;
	String location;
	
	public Apple(String taste, String location) {
		super("Apple", "Red");
		this.taste = taste;
		this.location = location;
	}
	
	public void display() {
		System.out.println("Name = " +name);
		System.out.println("Color of Apple = " +color);
		System.out.println("Taste of Apple = " +taste);
		System.out.println("Location of Apple = " +location);
	}
}
