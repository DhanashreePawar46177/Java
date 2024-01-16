package Lopping_Statements;

public class Armstrong_No_Using_while {
	public static void main(String[] args) {
		int a = 153, rem = 0, No = a, Cnt = 0,ans = 0;
		
		System.out.println("Number = " +a);
		
		while(No > 0)
		{
			No = No / 10;
			Cnt++;
		}
		System.out.println("Count = " +Cnt);
		
		No = a;
		while(No > 0)
		{
			rem = No % 10;
			No = No / 10;
			ans = ans+((int)Math.pow(rem, Cnt));
		}
		System.out.println("Cube = " +ans);
		
		if(ans == a)
		{
			System.out.print(a +" is Armstrong");
		}
		else
		{
			System.out.print(a +" is Not Armstrong");
		}
	}
}
