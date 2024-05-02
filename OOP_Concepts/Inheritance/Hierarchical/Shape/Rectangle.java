package OOP_Concepts.Inheritance.Hierarchical.Shape;

public class Rectangle extends Shape{
	int length;
	int breadth;
	int area;
	
	public Rectangle(int length, int breadth) {
		super("Pink", "Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
	
	public int area() {
		area = length*breadth;
		return area;
	}
	
	public void display() {
		System.out.println("Color = " +color);
		System.out.println("Name = " +name);
	}
}
