package Static.Use_of_Static_Block;

public class Static_Block {
	public void m1() {
		System.out.println("m1 Method");
	}
	
	static {
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		
		Static_Block obj = new Static_Block();
		obj.m1();
	}
}
