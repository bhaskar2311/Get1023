package dao;

import java.util.List;
import java.util.Map;

import model.Course;
//import model.Registration;
import model.Student;

public interface StudentDao {
	String addNewStudent(Student student);
	void updateStudentProfile(Student student);
	void registration(Student student,Course course);
	Map<Student, Course> viewAllRegistrations();
	Student findAStudentByRollNo(int rollNo);
	List<Student> viewAllStudents();
	void addNewCourse(Course course);
	Course findCourseById(int courseId);
	List<Course> viewAllCourses();
	Student findStudentByRollNo(int rollNo);
	Map<Student, Course> viewAllRegistration();
	
	
}

