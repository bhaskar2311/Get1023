package controller;

import java.util.List;
import java.util.Map;

import dao.StudentDao;
import dao.StudentDaoImplDatabase;
import exception.PhoneException;
import model.Course;
import model.Student;

public class StudentController {

	StudentDao dao= new StudentDaoImplDatabase();
	
	public String addNewStudent(Student student) {
		if(student.getPhoneNo().length()!=10)
		{
			try {
				throw new PhoneException("Invalid Phone Number");
			} catch (PhoneException e) {
				// TODO Auto-generated catch block
				return e.getMessage();
			}
		}
		dao.addNewStudent(student);
		return "New Student Added Successfully";
	}

	public void updateStudentProfile(Student student) {
		
	}
	
	public void registration(Student student, Course course) {
		
	}

	public Map<Student, Course> viewAllRegistrations() {
		return null;
	}
	
	public Student findAStudentByRollNo(int rollNo) {
		return null;
	}
	
	public List<Student> viewAllStudents() {
		return dao.viewAllStudents();
	}
	
	public void addNewCourse(Course course) {

	}
	
	public Course findCourseById(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> viewAllCourses() {
		return null;
	}
}
