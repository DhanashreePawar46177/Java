package OOP_Concepts.Abstraction.Abstract_Class.Arithmetic_Abstraction;

public abstract class Parent {
	int a = 70, b = 30;
	
	public void Add() {
		System.out.println("Addition = " +(a+b));
	}
	public void Sub() {
		System.out.println("Substraction = " +(a-b));
	}
	public abstract void Mult();
	public abstract void Div();
}
