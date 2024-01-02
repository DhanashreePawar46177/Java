package Operators;

public class Unary {
	public static void main(String[] args) {
		int a = 23;

		System.out.println(a);      //23      
		System.out.println(a++);    //23  PostIncrement-Increment after printing 
		System.out.println(a);      //24

		System.out.println(++a);    //25  PreIncrement-Increment before printing
		System.out.println(a);      //25

		System.out.println(a--);    //25  PostIncrement-Decrement after printing
		System.out.println(a);      //24  

		System.out.println(--a);    //23  PreIncrement-Decrement before printing
		System.out.println(a);      //23
	}
}
