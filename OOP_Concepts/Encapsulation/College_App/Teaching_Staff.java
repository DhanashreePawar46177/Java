package OOP_Concepts.Encapsulation.College_App;

public class Teaching_Staff {
	private int id;
	private String name;
	private String designation;
	private String department;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Teaching_Staff [id=" + id + ", name=" + name + ", designation=" + designation + ", department="
				+ department + "]";
	}
	public Teaching_Staff() {
	
	}
	public Teaching_Staff(int id, String name, String designation, String department) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department = department;
	}
}
