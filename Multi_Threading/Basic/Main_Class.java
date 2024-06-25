package Multi_Threading.Basic;

public class Main_Class {
	public static void main(String[] args) {
		A t = new A();
		A t1 = new A();
		A t2 = new A();
		
		t.start();
		t1.start();
		t2.start();
	}
}
