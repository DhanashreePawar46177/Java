package Exception_Handling.Nested_try_catch;

public class String_and_int {
	public static void main(String[] args) {
		try {
			try {
				int a = 10, b = 0;
				int c = a/b;
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception");
			}
			String s = null;
			s.length();
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}
	}
}
