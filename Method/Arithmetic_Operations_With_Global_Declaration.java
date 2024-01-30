package Method;

public class Arithmetic_Operations_With_Global_Declaration {
	int a = 10;
	int b = 20;
	int add, mult, div;
	
	public void add() {
		add = a + b;
		System.out.println("Addition = " +add);
	}
	
	public void mult() {
		mult = add * 4;
		System.out.println("Multiplication = " +mult);
	}
	
	public void div() {
		div = mult / 6;
		System.out.println("Division = " +div);
	}
	
	public static void main(String[] args) {
		Arithmetic_Operations_With_Global_Declaration m = new Arithmetic_Operations_With_Global_Declaration();
		m.add();
		m.mult();
		m.div();
	}
}
