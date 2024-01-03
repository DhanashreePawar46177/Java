package Conditional_Statements;

public class If_Else_Voting {
	public static void main(String[] args) {
		byte age = 20;
		String nationality = "Indian";

		System.out.println("Age = " +age);
		if(age > 18 && nationality == "Indian")
		{
			System.out.println("Eligile for Voting");
		}
		else 
		{
			System.out.println("Not Eligile for Voting");
		}
	}
}
