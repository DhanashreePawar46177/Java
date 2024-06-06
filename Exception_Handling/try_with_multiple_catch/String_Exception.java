package Exception_Handling.try_with_multiple_catch;

public class String_Exception {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}
}
