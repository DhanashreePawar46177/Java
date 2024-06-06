package Exception_Handling.throws_Keyword.Use_Of_throws_Keyword;

public class Main_Class {
	public static void main(String[] args) {
		A a = new A();
		try {
			a.m1();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		try {
			a.m2();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception");
		}
		
		try {
			a.m3();
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out Of Bounds Exception");
		}
	}
}
