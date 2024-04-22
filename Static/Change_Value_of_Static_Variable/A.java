package Static.Change_Value_of_Static_Variable;

public class A {
	static int c;
	int a;
	int b;
	
	public A(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public A() {
		
	}
	
	//We can access static variable directly without creating object
//	public static void main(String[] args) {
//		System.out.println(c);
//	}
}
