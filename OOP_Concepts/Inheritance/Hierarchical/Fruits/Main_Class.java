package OOP_Concepts.Inheritance.Hierarchical.Fruits;

public class Main_Class {
	public static void main(String[] args) {
		Mango m = new Mango("Sweet","Abc");
		m.display();
		
		Orange o = new Orange("Sweet", "Xyz");
		o.display();
		
		Apple a = new Apple("Sweet", "Pqr");
		a.display();
	}
}
