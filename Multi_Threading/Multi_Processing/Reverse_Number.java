package Multi_Threading.Multi_Processing;

public class Reverse_Number implements Runnable{
	public void run() {
		for(int i = 10; i >= 1; i--) {
			System.out.println("r " +i);
		}
	}
}
