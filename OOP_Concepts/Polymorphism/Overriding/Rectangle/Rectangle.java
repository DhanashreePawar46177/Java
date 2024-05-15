package OOP_Concepts.Polymorphism.Overriding.Rectangle;

import java.util.Scanner;

public class Rectangle extends Shape{
	
	public void getArea() {
		int area,length,breadth;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length Of Rectangle");
		length = sc.nextInt();
		
		System.out.println("Enter Breadth Of Rectangle");
		breadth = sc.nextInt();
		
		area = length*breadth;
		
		System.out.println("Area Of Rectangle = " +area);
	}
}
