package String;

public class Count_Of_Word_in_String {
	public static void main(String[] args) {
		String a = " I am Dhanu Pawar ";
		int cnt = 0;
		  
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(0) == ' ' && i == 0) {
				i++;
			}
			else if(a.charAt(i) == ' ' && (a.charAt(i-1)) != ' ') {
				cnt++;
			}
		}
		if(a.charAt(a.length()-1) != ' '){
			cnt++;
		}
		System.out.print("Count of Words = " +cnt);
	}
}
