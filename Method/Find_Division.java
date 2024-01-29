package Method;

public class Find_Division {
	int a = 10;
	int b = 20;
	
	public int div() {
		int div = b/a;
		System.out.println(div);
		return div;
	}
	
	public static void main(String[] args) {
		Find_Division Obj = new Find_Division();
		System.out.println("Division = " +Obj.div());
	}
}
