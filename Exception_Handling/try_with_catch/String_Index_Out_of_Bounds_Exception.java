package Exception_Handling.try_with_catch;

public class String_Index_Out_of_Bounds_Exception {
	public static void main(String[] args) {
		String s = "Dhanashree Pawar";
		
		System.out.println(s.charAt(2));
		
		try {
			System.out.println(s.charAt(20));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Can not access out of index");
		}
		
		System.out.println("Program End");
	}
}
