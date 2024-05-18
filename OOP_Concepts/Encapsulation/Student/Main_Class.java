package OOP_Concepts.Encapsulation.Student;

public class Main_Class {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("Dhanashree Pawar");
		s.setRollNo(159);
		s.setmobNo(9888765432l);
		s.setEmail("dhanupawar@gmail.com");
		
		System.out.println(s.getName());
		System.out.println(s.getRollNo());
		System.out.println(s.getMobNo());
		System.out.println(s.getEmail());
		
		
		Student s1 = new Student();
		
		s1.setName("Komal Pawar");
		s1.setRollNo(160);
		s1.setmobNo(7565565432l);
		s1.setEmail("kpawar@gmail.com");
		
		System.out.println(s1.getName());
		System.out.println(s1.getRollNo());
		System.out.println(s1.getMobNo());
		System.out.println(s1.getEmail());
		
		Student s2 = new Student();
		
		s2.setName("Dhiraj Pawar");
		s2.setRollNo(161);
		s2.setmobNo(8765432109l);
		s2.setEmail("dhirajpawar@gmail.com");
		
		System.out.println(s2.getName());
		System.out.println(s2.getRollNo());
		System.out.println(s2.getMobNo());
		System.out.println(s2.getEmail());
		
		System.out.println(s);
	}
}
