package OOP_Concepts.Inheritance.Hierarchical.Operation;

public class Main_Class {
	public static void main(String[] args) {
		Addition a = new Addition(8,18);
		
		System.out.println("Addition = " +a.add());
		
		Subtraction s = new Subtraction(87,9);
		System.out.println("Subtraction = " +s.sub());
		
		Multiplication m = new Multiplication(6,9);
		System.out.println("Multiplication = " +m.mult());
		
		Division d = new Division(88,8);
		System.out.println("Division = " +d.div());
	}
}
