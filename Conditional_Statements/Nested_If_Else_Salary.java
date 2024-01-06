package Conditional_Statements;

public class Nested_If_Else_Salary {
	public static void main(String[] args) {
		int salary = 59000;

		System.out.println("Salary = " +salary);

		if(salary >= 5000)
		{
			if(salary >= 10000)
			{
				if(salary >= 20000)
				{
					if(salary >= 40000)
					{
						if(salary >= 50000)
						{
							System.out.println("You have extra 10000");
						}
						else
						{
							System.out.println("+8000");
						}
					}
					else
					{
						System.out.println("+6000");
					}
				}
				else
				{
					System.out.println("+4000");
				}
			}
			else
			{
				System.out.println("+2000");
			}
		}
		else
		{
			System.out.println("+0");
		}
	}
}
