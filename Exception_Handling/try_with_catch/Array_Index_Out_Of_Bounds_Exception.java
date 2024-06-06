package Exception_Handling.try_with_catch;

public class Array_Index_Out_Of_Bounds_Exception {
	public static void main(String[] args) {
		int arr[] = {7,9,0,7,5,8,3};
		
		System.out.println(arr[4]);
		
		try {
			System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Can not access out of index");
		}
		System.out.println("Program End");
	}
}
