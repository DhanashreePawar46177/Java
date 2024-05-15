package OOP_Concepts.Polymorphism.Overloading.Shape;

public class Main_Class {
	public static void main(String[] args) {
		Shape s = new Shape();
		
		s.area(8);
		s.area(6, 10);
		s.area(8, 9);
		s.area(3.14f, 12);
	}
}
