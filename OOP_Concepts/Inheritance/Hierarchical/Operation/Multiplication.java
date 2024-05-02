package OOP_Concepts.Inheritance.Hierarchical.Operation;

public class Multiplication extends Operation{
	int mult;
	
	public Multiplication(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int mult() {
		mult = num1*num2;
		return mult;
	}
}
