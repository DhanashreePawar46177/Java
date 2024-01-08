package Conditional_Statements;

public class Switch_Breakfast {
	public static void main(String[] args) {
		String day= "Saturday";

		System.out.println("Menu for day "+day);

		switch(day)
		{
			case "Sunday" :
				System.out.println("Pav Bhaji");
				break;
		
			case "Monday" :
				System.out.println("Poha");
				break;
	
			case "Tuesday" :
				System.out.println("Samosa");
				break;

			case "Wednesday" :
				System.out.println("Shira");
				break;

			case "Thurday" :
				System.out.println("Dosa");
				break;

			case "Friday" :
				System.out.println("Upama");
				break;

			case "Saturday" :
				System.out.println("Idli");
				break;

			default:
				System.out.println("Please Enter Valid Day.");
				break;
		}	
	}
}
