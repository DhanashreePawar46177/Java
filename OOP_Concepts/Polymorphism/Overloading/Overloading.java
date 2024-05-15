package OOP_Concepts.Polymorphism.Overloading;

public class Overloading {
	public void m1() {
		System.out.println("m1 without parameter");
	}
	public void m1(int a) {
		System.out.println("m1 with int parameter");
	}
	public void m1(char c) {
		System.out.println("m1 with char parameter");
	}
	public void m1(int b, String s) {
		System.out.println("m1 with int and String parametrs");
	}
}
