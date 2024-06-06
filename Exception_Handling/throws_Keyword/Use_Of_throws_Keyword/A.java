package Exception_Handling.throws_Keyword.Use_Of_throws_Keyword;

public class A {
	public void m1() throws ArithmeticException{
		int a= 10;
		int b = 0;
		
		System.out.println(a/b);
	}
	public void m2() throws ArrayIndexOutOfBoundsException{
		int arr[] = {6,6,7};

		System.out.println(arr[6]);
	}
	public void m3() throws StringIndexOutOfBoundsException{
		String s = "Dhanashree";
		
		System.out.println(s.charAt(13));
	}
}
