package OOP_Concepts.Abstraction.Interface.Two_Interfaces02;

public abstract class Implemented_Class implements Interface_A,Interface_B{
	public void m1() {
		System.out.println("m2 from Interface_A");
	}
	public void m2() {
		System.out.println("m2 from Interface_A");
	}
	
	public void m3() {
		System.out.println("m3 from Interface_B");
	}
	
	public abstract void m4();
	public abstract void m5();
}
