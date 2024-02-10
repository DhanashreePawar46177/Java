package String;

public class Count_Of_a_in_Given_String {
	public static void Count_a() {
		int cnt = 0;
		String s = "Dhanashree Anil Pawar";
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == 'a') {
				cnt++;
			}
		}
		
		System.out.println("Given_String = " +s);
		System.out.println("Count of a = " +cnt);
	}
	
	public static void main(String[] args) {
		Count_a();
	}
}
