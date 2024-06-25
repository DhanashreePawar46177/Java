package Multi_Threading.Syncronization;

public class Produce extends Thread{
	Company c;
	
	public Produce(Company c) {
		this.c = c;
	}
	public void run() {
		//c.produce(1);
		
		for(int i = 1; i <= 10; i++) {
			c.produce(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
