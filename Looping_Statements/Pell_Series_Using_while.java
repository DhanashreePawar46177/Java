package Lopping_Statements;

public class Pell_Series_Using_while {
	public static void main(String[] args) {
		int no1 = 0, no2 = 1,n2=100, temp = 0;
	
		while(temp<n2)
		{
			System.out.println(temp);
			if(no1 == 0)
			{
				System.out.println(no2);
			}
			temp = no1 + no2*no2;
			no1=no2;
			no2=temp;
		}
	}
}
