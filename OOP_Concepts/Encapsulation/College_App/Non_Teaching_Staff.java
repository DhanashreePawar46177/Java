package OOP_Concepts.Encapsulation.College_App;

public class Non_Teaching_Staff {
	private int id;
	private String name;
	private String department;
	private String Designamtion;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignamtion() {
		return Designamtion;
	}
	public void setDesignamtion(String designamtion) {
		Designamtion = designamtion;
	}
	
	@Override
	public String toString() {
		return "Non_Teaching_Staff [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	public Non_Teaching_Staff(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public Non_Teaching_Staff() {
		
	}
	
}
