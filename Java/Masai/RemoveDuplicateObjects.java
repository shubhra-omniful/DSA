import java.lang.*;
import java.util.*;

class Student{

	int roll;
	String name;
	int marks;

	public int getRoll(){
		return this.roll;
	}

	public String getName(){
		return this.name;
	}

	public int getMarks(){
		return this.marks;
	}

	public Student(){}

	public Student(int roll, String name, int marks){
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public boolean equals(Object obj){
		if ( this == obj ) return true;
		if ( obj == null || getClass() != obj.getClass() ) return false;

		Student s1 = (Student)obj;
		return this.roll == s1.roll && this.marks == s1.marks && this.name.equals(s1.name);
	}

	@Override
	public int hashCode(){
		int result = this.roll;
		result = 31 * result * Objects.hashCode(this.name);
		result = 31 * result * marks;
		return result;
	}
}

class RemoveDuplicate implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2){
		if ( s1 == s2 ) return 0;
		else if ( s1.getRoll() > s2.getRoll() ) return -1;

		return 1;
	}
}