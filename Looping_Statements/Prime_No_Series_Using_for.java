package Lopping_Statements;

public class Prime_No_Series_Using_for {
	public static void main(String[] args) {
		System.out.println("Prime Numbers 1-100");
		int temp = 0;
		for(int i = 1; i <= 100; i++)
		{
			for(temp = 2; i>temp; temp++)
			{
				if(i%temp == 0)
				{
					break;
				}
			}
			if(i == temp)
			{
				System.out.println(i);
			}
		}
	}
}
