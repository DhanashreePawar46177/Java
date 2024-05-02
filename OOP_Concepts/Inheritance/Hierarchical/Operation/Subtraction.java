package OOP_Concepts.Inheritance.Hierarchical.Operation;

public class Subtraction extends Operation{
	int sub;
	
	public Subtraction(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int sub() {
		sub = num1-num2;
		return sub;
	}
}
