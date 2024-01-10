package Conditional_Statements;

public class Switch_States {
	public static void main(String[] args) {
		String state = "Karnataka";

		System.out.println("Districts in "+state);

		switch(state)
		{
			case "Maharashtra" :
				System.out.println("Satara");
				System.out.println("Sangli");
				System.out.println("Kolhapur");
				break;
		
			case "Karnataka" :
				System.out.println("Bagalkot");
				System.out.println("Ballari");
				System.out.println("Belagavi");
				break;
	
			case "Odisa" :
				System.out.println("Ganjam");
				System.out.println("Cuttak");
				System.out.println("Baleshwar");
				break;

			case "Gujarat" :
				System.out.println("Ahmedabad");
				System.out.println("Amreli");
				System.out.println("Anand");
				break;

			case "Rajashtan" :
				System.out.println("Jaipur");
				System.out.println("Jodhpur");
				System.out.println("Ajmer");
				break;

			default:
				System.out.println("Please Enter Valid State Name.");
				break;
		}	
	}
}
