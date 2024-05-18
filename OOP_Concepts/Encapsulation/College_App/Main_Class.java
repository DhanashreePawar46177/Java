package OOP_Concepts.Encapsulation.College_App;

public class Main_Class {
	public static void main(String[] args) {
		Student s = new Student();
		s.setRollNo(1);
		s.setName("Dhanashree");
		s.setMobNo(8765907654l);
		s.setDepartment("CS");
		
		Student s1 = new Student(2,"Pranali",8976578966l,"CS");
/////		
		System.out.println(s);
		System.out.println(s1);
		
		Teaching_Staff t = new Teaching_Staff();
		t.setId(11);
		t.setName("Prof.Pawar");
		t.setDesignation("MCA");
		t.setDepartment("CS");
		
		Teaching_Staff t1 = new Teaching_Staff(12,"Prof.Patil","MBA","CS");
		System.out.println(t);
		System.out.println(t1);
		
		Non_Teaching_Staff t2 = new Non_Teaching_Staff();
		t2.setId(101);
		t2.setName("Mahesh");
		t2.setDepartment("Cleaning");
		t2.setDesignamtion("12th");
		
		Non_Teaching_Staff t3 = new Non_Teaching_Staff(102,"Ramesh","Abc");
		
		System.out.println(t2);
		System.out.println(t3);
		
		
	}
}
