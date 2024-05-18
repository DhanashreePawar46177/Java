package OOP_Concepts.Encapsulation.Student;

public class Student {
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", mobNo=" + mobNo + ", email=" + email + "]";
	}
	
	private String name;
	private int rollNo;
	private long mobNo;
	private String email;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setmobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public int getRollNo(){
		return rollNo;
	}
	public long getMobNo() {
		return mobNo;
	}
	public String getEmail() {
		return email;
	}
}
