package Multi_Threading.DaemonThread;

public class Main_Class {
	public static void main(String[] args) {
		Print_Number t1 = new Print_Number();
		Print_Number t2 = new Print_Number();
		
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}
}
