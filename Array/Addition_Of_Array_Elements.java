package Array;

public class Addition_Of_Array_Elements {
	public static void main(String[] args) {
		int a[] = {7,3,4,6,2};
		int add = 0;
		
		for(int i = 0; i < a.length; i++) {
			add = add + a[i];
		}
		
		System.out.println("Addition of Array = " +add);
	}
}
