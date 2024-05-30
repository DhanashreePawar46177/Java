package OOP_Concepts.Abstraction.Interface.Two_Interfaces;

public class Child implements Interface_A, Interface_B{
	public void m1() {
		System.out.println("m1 from Interface_A");
	}
	public void m2() {
		System.out.println("m2 from Interface_A");
	}
	public void m3() {
		System.out.println("m3 from Interface_A");
	}
	public void m4() {
		System.out.println("m4 from Interface_B");
	}
	public void m5() {
		System.out.println("m5 from Interface_B");
	}
	public void m6() {
		System.out.println("m6 from Interface_B");
	}
}
