package OOP_Concepts.Polymorphism.Overloading.Basic_Overriding;

public class Main_Class {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		p.m2();
		
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
		Parent pc = new Child();//Hybrid Object
		pc.m1();
		pc.m2();
		pc.m4();
	}
}
