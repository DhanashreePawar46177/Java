package String;

public class Find_Duplicate_Letters_in_Given_String {
	public static void main(String[] args) {
		String s = "Karad";
		int cnt=0;
		s = s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			cnt =0;
			
			for(int a = i; a < s.length(); a++) {
				if(s.indexOf(ch) < i) {
					break;
				}
				
				if((ch == s.charAt(a)) && (i != a) && (ch != ' ')) {
					cnt++;
					s.charAt(s.indexOf(ch));
				}
			}
			if(cnt>0) {
				System.out.println(ch);
			}
			
		}
	}
}
