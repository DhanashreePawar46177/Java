package Conditional_Statements;

public class Else_If_Ladder_WeekDays {
	public static void main(String[] args) {
		String day = "Saturday";

		System.out.println("Day = " +day);

		if(day == "Sunday")
		{
			System.out.println("Samosa");
		}
		else if(day == "Monday")
		{
			System.out.println("Idli");
		}
		else if(day == "Tuesday")
		{
			System.out.println("Poha");
		}
		else if(day == "Wednesday")
		{
			System.out.println("Shira");
		}
		else if(day == "Thursday")
		{
			System.out.println("Upama");
		}
		else if(day == "Friday")
		{
			System.out.println("Dosa");
		}
		else if(day == "Saturday")
		{
			System.out.println("Pav Bhaji");
		}
		else
		{
			System.out.println("Please Enter Valid Day");
		}
	}
}
