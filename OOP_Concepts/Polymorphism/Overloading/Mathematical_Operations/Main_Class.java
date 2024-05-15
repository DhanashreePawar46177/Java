package OOP_Concepts.Polymorphism.Overloading.Mathematical_Operations;

public class Main_Class {
	public static void main(String[] args) {
		Mathematical_Operation m = new Mathematical_Operation();
		m.Operation();
		m.Operation(20, 12,1.2f);
		m.Operation(4, 4, 2);
		m.Operation(10, 2);
	}
}
