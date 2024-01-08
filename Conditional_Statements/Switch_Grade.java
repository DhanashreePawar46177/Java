package Conditional_Statements;

public class Switch_Grade {
	public static void main(String[] args) {
		String grade = "F";

		switch(grade)
		{
			case "A+" :
			System.out.println("You got 90+ marks.");
			break;
		
			case "A" :
			System.out.println("You got 90 below and 70+ marks.");
			break;
	
			case "B" :
			System.out.println("You got 70 below and 60+ marks.");
			break;

			case "C" :
			System.out.println("You got 60 below and 50+ marks.");
			break;

			case "D" :
			System.out.println("You got 50 below and 35+ marks.");
			break;

			case "F" :
			System.out.println("You got 35 below marks.");
			break;

			default:
			System.out.println("Please Enter Valid Grade.");
			break;
		}	
	}
}
