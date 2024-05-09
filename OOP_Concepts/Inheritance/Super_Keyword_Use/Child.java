package OOP_Concepts.Inheritance.Super_Keyword_Use;

public class Child extends Parent{
	public Child(){
		super(); //Keyword
		//super();
		//Calls Parent Class Constructor
		System.out.println("In Child Constructor");
	}
	public void Show_Child() {
		System.out.println("In Show_Child Method");
	}
}
