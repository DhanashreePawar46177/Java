package String;

public class Count_the_I_Or_i_In_Given_String {
	public static void Count_I_Or_i() {
		int cnt = 0;
		String s = "Dhanashree Anil Pawar";
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == 'I' || ch == 'i') {
				cnt++;
			}
		}
		
		System.out.println("Given_String = " +s);
		System.out.println("Count of I or i = " +cnt);
	}
	
	public static void main(String[] args) {
		Count_I_Or_i();
	}
}
