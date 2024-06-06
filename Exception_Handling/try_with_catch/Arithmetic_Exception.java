package Exception_Handling.try_with_catch;

public class Arithmetic_Exception {
	public static void main(String[] args) {
		int a = 23;
		int b = 0;
		int c;
		
		try {
			c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println("You can not divide by zero");
		}
		
		System.out.println("Program end");
	}
}
