package String;

public class Count_the_Vowels_In_String {
	public static void Count_Vowels() {
		int cnt = 0;
		String s = "Dhanashree Anil Pawar";
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				cnt++;
			}
		}
		
		System.out.println("Given_String = " +s);
		System.out.println("Count of Vowels = " +cnt);
	}
	
	public static void main(String[] args) {
		Count_Vowels();
	}
}
