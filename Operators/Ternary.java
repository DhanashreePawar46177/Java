package Operators;

public class Ternary {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int c = (a>b) ? 10 : 20;
		System.out.println(c);

		char ch = (a>b) ? 'A' : 'B';
		System.out.println(ch);

		float time = (a>b) ? 10.10f : 09.10f;
		System.out.println(time);
	}
}
