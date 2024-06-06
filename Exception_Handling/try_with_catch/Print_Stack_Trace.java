package Exception_Handling.try_with_catch;

public class Print_Stack_Trace {
	public static void main(String[] args) {
		System.out.println("Program Start");
		
		try {
			String s = null;
			System.out.println(s.charAt(2));
		}
		//catch(Object e)  //Compilation Error
		//catch(Throwable e) {
		//catch(Exception e) {
		//catch(RuntimeException e) {
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println("String is null");
		}
		System.out.println("Program End");
	}
}
