package OOP_Concepts.Inheritance.Hierarchical.Shape;

public class Square extends Shape{
	int side;
	int area;
	
	public Square(int side) {
		super("Red", "Square");
		this.side = side;
	}
	
	public int area() {
		area = side*side;
		return area;
	}
	
	public void display() {
		System.out.println("Color = " +color);
		System.out.println("Name = " +name);
	}
}
