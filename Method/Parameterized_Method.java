package Method;

public class Parameterized_Method {
	int a = 20;
	int b = 30;
	
	public void div(int a,int b) {
		int div = b/a;
		System.out.println("div method.....div = " +div);
	}
	
	public void Change() {
		a = 1;
		b = 2;
		
		System.out.println("change method...a = " +a);
		System.out.println("change method...b = " +b);
	}
	
	public void add() {
		int c = a + b;
		System.out.println("add method...add = " +c);
	}
	
	public static void main(String[] args) {
		Parameterized_Method Obj = new Parameterized_Method();
		Obj.div(10, 20);
		
		Obj.Change();
		Obj.add();
	}
}
