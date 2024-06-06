package Exception_Handling.Custom_Exception.Marriage_Registration;

public class MarriageAgeValidation {	
	public void marriageAgeValidation(int femaleAge, int maleAge) {
		if(femaleAge >= 18 && maleAge >= 21) {
			System.out.println("You are Eligible to Marriage");
		}
		else {
			try {
				throw new CantRegisterException("You are Not Eligible");
			}
			catch(CantRegisterException e) {
				System.out.println(e);
				System.out.println("Register later");
			}
		}
		System.out.println("End.....");
	}
}
