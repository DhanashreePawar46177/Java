package String;

public class Count_the_space_in_given_string {
	public static void Count_Space() {
		int cnt = 0;
		String s = "Dhanashree Anil Pawar";
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == ' ') {
				cnt++;
			}
		}
		
		System.out.println("Given_String = " +s);
		System.out.println("Count of Space = " +cnt);
	}
	
	public static void main(String[] args) {
		Count_Space();
	}
}
