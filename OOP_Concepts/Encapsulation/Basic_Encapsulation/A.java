package OOP_Concepts.Encapsulation.Basic_Encapsulation;

public class A {
	private int a;
	private int b;
	
	public A(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void m1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void display() {
		System.out.println(a);
		System.out.println(b);
	}
}
