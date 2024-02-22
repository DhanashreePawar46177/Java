package String;

public class Use_Of_Methods_Of_String {
	public static void main(String[] args) {
		String s = "  India is my country.";
		String s4 = "India";
		
		//Use to remove initial and last spaces of string
		String s1 = s.trim();
		System.out.println(s1);
		
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		
		String s3 = s2.toLowerCase();
		System.out.println(s3);
		
		//Concatenation
		String name = "Dhanu";
		String surname = "Pawar";
		String othername = "dhanu";
		
		System.out.println(name.concat(surname));
		
		System.out.println(name.concat(surname).length());
		
		System.out.println("*********************");
		char a = s.charAt(2);
		System.out.println(a);
		
		int a1 = name.compareTo(surname);
		System.out.println(a1);
		
		int a2 = name.compareToIgnoreCase(surname);
		System.out.println(a2);
		
		String a3 = name.concat(surname);
		System.out.println(a3);
		
		boolean a4 = s.contains(s4);
		System.out.println(a4);
		
		boolean a5 = s.contentEquals(s4);
		System.out.println(a5);
		
		boolean a6 = s.endsWith(s4);
		System.out.println(a6);
		
		boolean a7 = name.equals(othername);
		System.out.println(a7);
		
		boolean a8 = name.equalsIgnoreCase(othername);
		System.out.println(a8);
		
		byte[] a9 = s.getBytes();
		System.out.println(a9.hashCode());
		
		int a10 = name.hashCode();
		System.out.println(a10);
		
		int a11 = name.indexOf('D');
		//int a11 = name.indexOf(2);
		System.out.println(a11);
		
		boolean a12 = s.isBlank();
		System.out.println(a12);
		
		boolean a13 = s.isEmpty();
		System.out.println(a13);
		
		int a14 = s.length();
		System.out.println(a14);
		
		String a15 = s.replace("country","mother");
		System.out.println(a15);
		
		char[] a16 = s.toCharArray();
		System.out.println(a16);
		
		String a17 = s.toLowerCase();
		System.out.println(a17);
		
		String a18 = s.toString();
		System.out.println(a18);
		
		String a19 = s.toUpperCase();
		System.out.println(a19);
		
		String a20 = s.trim();
		System.out.println(a20);
		
		//s.wait();
	}
}
