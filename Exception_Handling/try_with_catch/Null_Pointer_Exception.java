package Exception_Handling.try_with_catch;

public class Null_Pointer_Exception {
	public static void main(String[] args) {
		String s = null;
		try {
			s.length();
		}
		catch(NullPointerException e) {
			System.out.println("Can not find length of null string");
		}
		System.out.println("Program End");
	}
}
