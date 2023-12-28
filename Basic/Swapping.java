package Basic;

public class Swapping {
	public static void main(String[] args) {
		int No1 = 10, No2 = 20;
		
		No1 = No1 + No2;
		No2 = No1 - No2;
		No1 = No1 - No2;
		
		System.out.println("No1 = " +No1);
		System.out.println("No2 = " +No2);
	}
}
