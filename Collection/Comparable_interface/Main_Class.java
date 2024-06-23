package Collection.Comparable_interface;

import java.util.ArrayList;
import java.util.TreeSet;

import Collection.ArrayList_with_Encapsulation.Array_List_Class;

public class Main_Class {
	public static void main(String[] args) {
		TreeSet<Student> al = new TreeSet();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Dhanshree");
		s1.setBranch("CS");
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Pranali");
		s2.setBranch("CS");
		
		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Anuja");
		s3.setBranch("CS");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(Student o:al) {
			System.out.println(o);
		}
	}
}
