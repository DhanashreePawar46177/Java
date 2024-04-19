package Static.Use_Of_Static_Method;

public class Main_Class {
	public static void main(String[] args) {
		//We can call static method by using class name
		Static_Method.m1();
		
		Static_Method obj = new Static_Method();
		obj.m1();
	}
}
