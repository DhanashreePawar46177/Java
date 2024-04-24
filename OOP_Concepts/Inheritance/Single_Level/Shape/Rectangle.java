package OOP_Concepts.Inheritance.Single_Level.Shape;

public class Rectangle extends Shape {
	int length;
	int width;
	int area;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public void area() {
		area = length*width;
	}
	
	public void display() {
		System.out.println("Length of Rectangle = " +length);
		System.out.println("Width of Rectangle = " +width);
		System.out.println("Area of Rectangle = " +area);
	}
}
