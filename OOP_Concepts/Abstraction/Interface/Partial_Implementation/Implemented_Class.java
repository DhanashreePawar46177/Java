package OOP_Concepts.Abstraction.Interface.Partial_Implementation;

public abstract class Implemented_Class implements Interface_A {
	public void m1(){
		System.out.println("m1 from Interface_A");
	}
	public void m2(){
		System.out.println("m2 from Interface_A");
	}
	public void m3(){
		System.out.println("m3 from Interface_A");
	}
	
	public abstract void m4();
	public abstract void m5();
	public abstract void m6();
}
