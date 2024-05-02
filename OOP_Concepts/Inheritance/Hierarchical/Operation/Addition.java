package OOP_Concepts.Inheritance.Hierarchical.Operation;

public class Addition extends Operation{
	int add;
	
	public Addition(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int add() {
		add = num1+num2;
		return add;
	}
}
