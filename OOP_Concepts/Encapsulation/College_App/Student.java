package OOP_Concepts.Encapsulation.College_App;

public class Student {
	private int rollNo;
	private String name;
	private long mobNo;
	private String department;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mobNo=" + mobNo + ", department=" + department + "]";
	}
	
	public Student(int rollNo, String name, long mobNo, String department) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mobNo = mobNo;
		this.department = department;
	}
	public Student() {
		
	}
}
