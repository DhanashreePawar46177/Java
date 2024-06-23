package Multi_Threading.Syncronization;

public class Main_Class {
	public static void main(String[] args) {
		Company comp = new Company();
		
		Produce p = new Produce(comp);
		Consume c = new Consume(comp);
		
		p.start();
		c.start();
	}
}
