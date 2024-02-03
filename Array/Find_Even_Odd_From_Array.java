package Array;

public class Find_Even_Odd_From_Array {
	public static void main(String[] args) {
		int a[] = {6,9,4,7,3,2};
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i]%2 == 0) {
				even = even +a[i];
			}
			else {
				odd = odd + a[i];
			}
		}
		
		System.out.print("Even add = " +even);
		System.out.print("\nOdd add = " +odd);
	}
}
