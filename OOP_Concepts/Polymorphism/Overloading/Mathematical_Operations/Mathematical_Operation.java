package OOP_Concepts.Polymorphism.Overloading.Mathematical_Operations;

public class Mathematical_Operation {
	public void Operation() {
		int num1 = 10;
		int num2 = 40;
		
		System.out.println("Addition Of two numbers = " +(num1+num2));
	}
	
	public void Operation(int num1, int num2,float num3) {
		System.out.println("Subtraction of two numbers = " +(num1-num2-num3));
	}
	
	public void Operation(int num1, int num2, int num3) {
		System.out.println("Multiplication of two numbers = " +(num1*num2*num3));
	}
	
	public void Operation(int num1, int num2) {
		System.out.println("Division of two numbers = " +(num1/num2));
	}
}
