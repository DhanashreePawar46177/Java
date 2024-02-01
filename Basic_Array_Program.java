package Array;

public class Basic_Array_Program {
	public static void main(String[] args) {
		//Create Array
		int a1[] = new int[10];
		int a[] = {1,2,6,7,9,2};
		String s[] = {"Abc","Xyz","Pqr"};
		
		//Read Array Elements
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//Update Array Element
		a[3] = 50;
		
		System.out.println(s[2]);
		System.out.println(a[3]);
	}
}
