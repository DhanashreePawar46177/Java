package Multi_Threading.if_else;

public class A extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		
		if(t.getName().equals("Thread-1")) {
			for(int i = 1; i <= 10; i++) {
				System.out.println(t.getName()+ " " + i);
			}
		}
	}
}
