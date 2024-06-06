package Exception_Handling.Custom_Exception.Marriage_Registration;

public class CantRegisterException extends RuntimeException{
	public CantRegisterException(String s) {
		super(s);
	}
}
