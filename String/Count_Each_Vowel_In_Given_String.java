package String;

public class Count_Each_Vowel_In_Given_String {
	public static void Count_Each_Vowel() {
		int cnt = 0;
		int a = 0, e = 0, I = 0, o = 0, u = 0;
		String s = "Dhanashree Anil Pawar";
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'A') {
				a++;
			}
			else if(ch == 'e' || ch == 'E') {
				e++;
			}
			else if(ch == 'i' || ch == 'I') {
				I++;
			}
			else if(ch == 'o' || ch == 'O') {
				o++;
			}
			else if(ch == 'u' || ch == 'U') {
				u++;
			}
		}
		
		System.out.println("Given_String = " +s);
		System.out.println("Count of a = " +a);
		System.out.println("Count of i = " +I);
		System.out.println("Count of o = " +o);
		System.out.println("Count of u = " +u);
	}
	
	public static void main(String[] args) {
		Count_Each_Vowel();
	}
}
