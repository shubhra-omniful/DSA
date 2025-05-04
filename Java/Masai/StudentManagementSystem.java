import java.lang.*;
import java.util.*;

class Student {

	private int rollNo ;
	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String phone;
	private String city;
	private String gender;


}

class StudentManagementApp{

	List<Student> students = new ArrayList<>();

	public void addStudent(Student student){
		if ( student.getRollNo() < 10 && student.getRollNo() > 100 ) {
			System.out.println("Please enter valid roll number");
			return;
		}

		for ( Student s : students ){
			if ( s.getRollNo() == student.getRollNo() ){
				System.out.println("Student is already present in the record");
				return ;
			}
		}


		students.add(student);
	}

	public void viewStudent(int rollNo){

		for ( Student student : students ){
			if ( student.getRollNo() == rollNo ){
				System.out.println("Student details");
				System.out.println("Roll No : "+student.getRollNo());
				System.out.println("First Name : "+student.getFirstName());
				System.out.println("Last Name : "+student.getLastName());
				System.out.println("Date of Birth : "+student.getDob());
				System.out.println("Email : "+student.getEmail());
				System.out.println("Phone Number : "+student.getPhoneNumber());
				System.out.println("City : "+student.getCity());
				System.out.println("Gender : "+student.getGender());
				return ;
			}
		}

		System.out.println("Student is not present in the record");
	}

	public void deleteStudent(int rollNo){

		for ( Student student : students ){
			if ( student.getRollNo() == rollNo ){
				viewStudent(rollNo);
				students.remove(student);
				return ;
			}
		}

		System.out.println("Student is not present in the record");
	}

	public void totalStudents(){
		System.out.println(students.size());
	}

}