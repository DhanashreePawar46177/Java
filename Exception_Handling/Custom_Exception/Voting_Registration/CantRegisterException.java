package Exception_Handling.Custom_Exception.Voting_Registration;

public class CantRegisterException extends RuntimeException{
	CantRegisterException(String str){
		super(str);
	}
}
