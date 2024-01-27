package Method;

public class Parameterized_with_this {
	int a = 10; 
	int b = 20;
	
	public void show(int a,char b) {
		System.out.println("show method...a = " +a);
		System.out.println("show method...b = " +b);
		
		System.out.println("show method...this.a = " +this.a);
		System.out.println("show method...this.b = " +this.b);
	}
	
	public static void main(String[] args) {
		Parameterized_with_this Obj = new Parameterized_with_this();
		Obj.show(10, 'A');
	}
}
