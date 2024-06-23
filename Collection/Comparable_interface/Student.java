package Collection.Comparable_interface;

public class Student implements Comparable<Student>{
	private int Id;
	private String name;
	private String branch;
	
	public Student() {

	}
	public Student(int id, String name, String branch) {
		super();
		Id = id;
		this.name = name;
		this.branch = branch;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Array_List_Class [Id=" + Id + ", name=" + name + ", branch=" + branch + "]";
	}
	//Compare with integer value
//	@Override
//	public int compareTo(Student o) {
//		int i = this.getId() - o.getId();
//		return i;
//	}
	
	//Compare with String value
	@Override
	public int compareTo(Student o) {
		int i = this.getName().compareTo(o.getName());
		return i;
	}
}
