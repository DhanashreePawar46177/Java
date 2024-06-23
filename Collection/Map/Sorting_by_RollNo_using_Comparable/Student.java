package Collection.Map.Sorting_by_RollNo_using_Comparable;

public class Student implements Comparable<Student>{
	private int Roll_No;
	private String name;
	
	public Student(int roll_No, String name) {
		super();
		Roll_No = roll_No;
		this.name = name;
	}
	public Student() {
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
		return "Student [Roll_No=" + Roll_No + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student s) {
		int i = this.getRoll_No()-s.getRoll_No();
		//int i = this.getName().compareTo(s.getName());
		return i;
	}
}
