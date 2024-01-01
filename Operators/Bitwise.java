package Operators;

public class Bitwise {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;

		boolean c;

		System.out.println("\n a = " + a + " b = " + b);

		c = a & a;
		System.out.println("\n a & a = " + c);

		c = a & b;
		System.out.println("\n a & b = " + c);

		c = b & a;
		System.out.println("\n b & a = " + c);

		c = b & b;
		System.out.println("\n b & b = " + c);

		c = a | a;
		System.out.println("\n a | a = " + c);

		c = a | b;
		System.out.println("\n a | b = " + c);

		c = b | a;
		System.out.println("\n b | a = " + c);

		c = b | b;
		System.out.println("\n b | b = " + c);
	}
}
