package OOP_Concepts.Inheritance.Hierarchical.Shape;

public class Main_Class {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(6,8);
		Square s = new Square(4);
		
		System.out.println("Area of square = " +r.area());
		r.display();
		
		System.out.println("Area of square = " +s.area());
		s.display();
	}
}
