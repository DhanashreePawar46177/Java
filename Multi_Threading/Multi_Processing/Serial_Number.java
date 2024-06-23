package Multi_Threading.Multi_Processing;

public class Serial_Number extends Thread {
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("s " +i);
		}
	}
}
