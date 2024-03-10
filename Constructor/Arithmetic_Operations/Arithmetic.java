package Constructor.Arithmetic_Operations;

public class Arithmetic {
	int a;
	int b;
	
	Arithmetic(){
		a = 20;
		b = 10;
	}
	
	Arithmetic(int a, int b){
		a = a;
		b = b;
		//this.a = a;
		//this.b = b;
	}
	
	public void Add() {
		int c = a + b;
		System.out.println("Addition = " +c);
	}
}
