package Multi_Threading.Methods_Of_Thread;

public class Main_Class {
	public static void main(String[] args) {
		Reverse_Number r = new Reverse_Number();
		Thread t = new Thread(r);
		t.start();
		
		Serial_Number s = new Serial_Number();
		s.start();
	}
}
