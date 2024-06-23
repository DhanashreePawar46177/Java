package Collection.Map.LinkedHashMap_in_Map;

public class POJO_Class {
	private int Roll_No;
	private String name;
	
	public POJO_Class(int roll_No, String name) {
		super();
		Roll_No = roll_No;
		this.name = name;
	}
	public POJO_Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "POJO_Class [Roll_No=" + Roll_No + ", name=" + name + "]";
	}
	
	
}
