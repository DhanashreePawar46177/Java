package Conditional_Statements;

public class Nested_If_Else_Age {
	public static void main(String[] args) {
		int age = 40;

		System.out.println("Age = " +age);

		if(age >= 18)
		{
			System.out.println("You are Eligible for Vote.");
			if(age >= 25)
			{
				System.out.println("You are Eligible for Vidhansabha.");
				if(age >= 35)
				{
					System.out.println("You are Eligible for Loksabha.");
					if(age >= 40)
					{
						System.out.println("You are Eligible for CM.");
						if(age >= 65)
						{
							System.out.println("You are Eligible for PM.");
						}
					}
				}
			}
		}
		else
		{
			System.out.println("You are not Eligible for Vote.");
		}
	}
}
