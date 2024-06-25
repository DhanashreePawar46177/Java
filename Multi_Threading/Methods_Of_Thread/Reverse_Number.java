package Multi_Threading.Methods_Of_Thread;

public class Reverse_Number implements Runnable{
	public void run() {
		for(int i = 10; i >= 1; i--) {
			Thread t = Thread.currentThread();
			String s = t.getName();
			//long l = t.getId();

			System.out.println(s+ " " +i);
		}
	}
}
