package Pattern_Printing;

public class Rectangle_5x3 {
	public static void main(String[] args) {
		for(int c = 1; c <= 3; c++) {
			System.out.println();
			for(int r = 1; r <= 5; r++) {
				System.out.print(" * ");
			}
		}
	}
}
