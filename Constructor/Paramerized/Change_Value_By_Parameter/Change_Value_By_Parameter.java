package Constructor.Parameterized.Change_Value_By_Parameter;

public class Change_Value_By_Parameter {
	int a = 23;
	int b = 25;
	
	Change_Value_By_Parameter(int a, int b){
		this.a = a; 
		this.b = a;
		System.out.println("Constructor Change_Value_By_Parameter");
	}
}
