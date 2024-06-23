package Multi_Threading.Basic;

public class A extends Thread implements Runnable{
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Exception");
			}
		}
	}
}
