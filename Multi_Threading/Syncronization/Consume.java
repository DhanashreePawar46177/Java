package Multi_Threading.Syncronization;

public class Consume extends Thread{
	Company c;
	
	public Consume(Company c) {
		this.c = c;
	}
	
	public void run() {
		//c.consume();
		
		for(int i = 1; i <= 10; i++) {
			c.consume();
		}
	}
}
