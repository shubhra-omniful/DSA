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
		if ( this == obj) return true;
		else if ( obj == null || getClass() != obj.getClass() ) return false; 

		Student s1 = (Student)obj;
		return this.roll == s1.roll && this.marks == s1.marks && this.name.equals(s1.name);
	}

	@Override
	public int hashCode(){
		int result = this.roll;
		result = 31 * result * Objects.hashCode(this.name);
		result = 31 * result * this.marks;
		return result;
	}
}

class StudentMarksNameComparator implements Comparator<Student> {
  
  @Override
  public int compare(Student obj1 , Student obj2 ){
  	if ( obj1.getMarks() ==  obj2.getMarks() ){
  		return obj1.getName().compareTo(obj2.getName());
  	}else if ( obj1.getMarks() > obj2.getMarks() ) return 1;

  	return -1; 
  }

}