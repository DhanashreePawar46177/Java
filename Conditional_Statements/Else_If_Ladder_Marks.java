package Conditional_Statements;

public class Else_If_Ladder_Marks {
	public static void main(String[] args) {
		int marks = 80;

		System.out.println("Marks = " +marks);

		if(marks <= 90)
		{
			System.out.println("A+");
		}
		else if(marks <= 70)
		{
			System.out.println("A");
		}
		else if(marks <= 60)
		{
			System.out.println("B");
		}
		else if(marks <= 50)
		{
			System.out.println("C");
		}
		else if(marks <= 35)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
