package Method;

public class Arithmetic_Operations_Without_Global_Declaration {
	int a = 10;
	int b = 20;
	
	public int add() {
		System.out.println("Addition = " +(a + b));
		return (a + b);
	}
	
	public int mult() {
		Arithmetic_Operations_Without_Global_Declaration m = new Arithmetic_Operations_Without_Global_Declaration();
		System.out.println("Multiplication = " +(m.add() * 4));
		return (m.add() * 4);
	}
	
	public void div() {
		Arithmetic_Operations_Without_Global_Declaration m = new Arithmetic_Operations_Without_Global_Declaration();
		System.out.println("Division = " +(m.mult() / 6));
	}
	
	public static void main(String[] args) {
		Arithmetic_Operations_Without_Global_Declaration m = new Arithmetic_Operations_Without_Global_Declaration();
		m.div();
	}
}
