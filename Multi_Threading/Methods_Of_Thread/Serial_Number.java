package Multi_Threading.Methods_Of_Thread;

public class Serial_Number extends Thread{
	public void run() {
		for(int i = 1; i <= 10; i++) {
			Thread t = Thread.currentThread();
			String s = t.getName();
			//long l = t.getId();
			
			System.out.println(s+ " " +i);
		}
	}
}
