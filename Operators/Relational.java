package Operators;

public class Relational {
	public static void main(String[] args) {
		int a = 12;
		int b = 34;

		boolean c = a < b;
		System.out.println("\n a is Less than b = " + c);

		c = a > b;
		System.out.println("\n a is Greater than b = " + c);

		c = a <= b;
		System.out.println("\n a is Less than or equal to b = " + c);

		c = a >= b;
		System.out.println("\n a is Greater than or equal to b = " + c);

		c = a == b;
		System.out.println("\n a is Double eqaul to b = " + c);

		c = a != b;
		System.out.println("\n a is Not eqaul to b = " + c);
	}
}
