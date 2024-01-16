package Lopping_Statements;

public class Armstrong_Number_Series_Using_while {
	public static void main(String[] args) {
		int  rem = 0, No = 0, Cnt = 0,Cube = 0;
		int i = 1;
		
		while(i<=10000)
		{
			No = i;
			Cnt=0;
			Cube=0;
			
			while(No > 0)
			{
				No = No / 10;
				Cnt++;
			}
			
			No=i;
			while(No > 0)
			{
				rem = No % 10;
				No = No / 10;
				Cube = Cube+((int)Math.pow(rem, Cnt));
			}
			
			if(Cube == i)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
