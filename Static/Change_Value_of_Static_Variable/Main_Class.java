package Static.Change_Value_of_Static_Variable;

public class Main_Class {
	public static void main(String[] args) {
		A a = new A(12,34);
		a.c = 50;
		a.b = 1000;
		System.out.println(a.a);
		System.out.println(a.b);
		A a1 = new A();
		
		System.out.println(a1.a);
		System.out.println(a1.b);
		
		System.out.println("________________");
		System.out.println(a.c);
		System.out.println(a1.c);
		
		A obj = new A();
		System.out.println(obj.c);
		
		System.out.println("________________");
		System.out.println(A.c);
	}
}
