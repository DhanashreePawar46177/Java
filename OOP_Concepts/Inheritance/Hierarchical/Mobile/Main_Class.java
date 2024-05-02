package OOP_Concepts.Inheritance.Hierarchical.Mobile;

public class Main_Class {
	public static void main(String[] args) {
		Moto m = new Moto();
		System.out.println(m.ram);
		System.out.println(m.sketRpm);
		System.out.println(m.processor);
		System.out.println(m.os);
		
		Nokia n = new Nokia();
		System.out.println(n.os);
	}
}
