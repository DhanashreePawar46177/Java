package OOP_Concepts.Inheritance.Hierarchical.Operation;

public class Division extends Operation{
	int div;
	
	public Division(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int div() {
		div = num1/num2;
		return div;
	}
}
