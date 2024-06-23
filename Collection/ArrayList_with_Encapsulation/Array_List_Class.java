package Collection.ArrayList_with_Encapsulation;

public class Array_List_Class {
	private int Id;
	private String name;
	private String branch;
	
	public Array_List_Class() {

	}
	public Array_List_Class(int id, String name, String branch) {
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
}
