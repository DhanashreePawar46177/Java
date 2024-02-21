package String;

public class Reverse_String {
	public static void Reverse_String() {
		String s = "India";
		String s1 = "";
		
		int length = s.length();
		
		for(int i = (length-1); i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		Reverse_String();
	}
}
