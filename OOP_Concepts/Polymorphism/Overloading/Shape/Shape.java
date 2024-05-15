package OOP_Concepts.Polymorphism.Overloading.Shape;

public class Shape {
	int area;
	public void area(int side) {
		area = side*side;
		System.out.println("Area Of Square = " +area);
	}
	
	public void area(int length, int breadth) {
		area = length*breadth;
		System.out.println("Area of Rectangle = " +area);
	}
	
	public void area(int base, float height) {
		area = base*(int)height;
		System.out.println("Area Of Triangle = " +area);
	}
	public void area(float pi, int radius) {
		float area = pi*(radius*radius);
		System.out.println("Area Of Triangle = " +area);
	}
}
