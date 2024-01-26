package Method;

public class Basic_Method {
	public void m() {
		System.out.println("India");
	}
	
	public static void main(String[] args) {
		Basic_Method a = new Basic_Method();
		a.m();
		a.m();
		
		System.out.println("Main End.");
	}
}
