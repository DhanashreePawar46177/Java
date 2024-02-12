package String;

public class Check_the_String_is_Palindrome_or_not {
	public static void main(String[] args) {
		String s = "wow";
		String r = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			r = r + s.charAt(i);
		}
		
		if(s.equals(r)) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is not Palindrome");
		}
	}
}
