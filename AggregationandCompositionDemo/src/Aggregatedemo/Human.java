package Aggregatedemo;

import java.util.List;


public class Human {
	
	Heart heart = new Heart();     //dependent object
	
	public Human() {		
		
	}

}
class Heart{
	
}


//Has a Relationship
class School{
	
	List<Student> students;
	public School() {
		
	}
	public void addStudent(Student student) {
		students.add(student);
		
	}
	
}
class Student{
	
}


