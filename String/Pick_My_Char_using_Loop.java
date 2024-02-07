package String;

public class Pick_My_Char_using_Loop {
	public static void pickChar() {
		String s = "Dhanashree";
		
		for(int i = 0; i < s.length();i++) {
			char ch = s.charAt(i);
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		pickChar();
	}
}
