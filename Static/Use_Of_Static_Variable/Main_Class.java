package Static.Use_Of_Static_Variable;

public class Main_Class {
	public static void main(String[] args) {
		Use_Of_Static obj = new Use_Of_Static();
		Use_Of_Static obj1 = new Use_Of_Static();
		Use_Of_Static obj2 = new Use_Of_Static();
		
		System.out.println(obj.b);
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		obj.a = 10;
		
		System.out.println(obj1.a);
	}
}
