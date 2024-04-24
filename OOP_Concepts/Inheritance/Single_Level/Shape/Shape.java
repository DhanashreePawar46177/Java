package OOP_Concepts.Inheritance.Single_Level.Shape;

public class Shape{
	String color;
	String name;
	
	public Shape() {
		
	}
	
	public void display() {
		System.out.println("Color = " +color);
		System.out.println("Name = " +name);
	}
	
	public Shape(String shape, String name) {
		this.color = color;
		this.name = name;
	}
}
