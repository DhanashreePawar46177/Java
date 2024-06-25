package Multi_Threading.DaemonThread;

public class Print_Number extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		for(int i = 1; i <= 10; i++) {
			if(t.getName().equals("Thread-01")) {
				try {
					t.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	}
}
