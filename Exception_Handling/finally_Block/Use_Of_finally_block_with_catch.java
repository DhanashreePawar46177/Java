package Exception_Handling.finally_Block;

public class Use_Of_finally_block_with_catch {
	public static void main(String[] args) {
		try {
			int a[] = {2,4,6};
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception");
		}
		finally{
			System.out.println("This is finally Block");
		}
		System.out.println("Program End");
	}
}
