package Exception_Handling.finally_Block;

public class Use_Of_finally_without_catch {
	public static void main(String[] args) {
		try {
			int a[] = {2,4,6};
			System.out.println(a[6]);
		}
		finally{
			System.out.println("This is finally Block");
		}
		System.out.println("Program End");
	}
}
