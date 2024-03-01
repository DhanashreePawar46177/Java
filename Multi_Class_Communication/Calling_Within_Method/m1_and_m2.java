package Multi_Class_Communication.Calling_Within_Method;

public class m1_and_m2 {
	public void m1() {
		System.out.println("This is m1");
	}
	
	public void m2() {
		m1_and_m2 m = new m1_and_m2();
		m.m1();
		
		System.out.println("This is m2");
		
		m1();
		this.m1();
	}
}
