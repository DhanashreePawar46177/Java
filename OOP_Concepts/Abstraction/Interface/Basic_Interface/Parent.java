package OOP_Concepts.Abstraction.Interface.Basic_Interface;

public interface Parent {
	public abstract void m1();
	void m2();
	void m3();
	
	public static void m4() {
		System.out.println("Static method from Interface");
		
		Parent c = new Child();
		c.m5();
	}
	
	private void m5() {
		System.out.println("Private method from Interface");
	}
}
