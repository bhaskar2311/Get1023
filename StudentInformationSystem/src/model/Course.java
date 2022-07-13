package model;

public class Course {
	private int courseId;
	private String courseName;
	private int durationInMonths;
	private double fee;
	private Qualification eligibilty;
	private static int courseIdGenerator=100;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public Course(String courseName, int duration, double fee, Qualification eligibilty) {
		super();
		this.courseId=++courseIdGenerator;
		this.courseName = courseName;
		this.durationInMonths = duration;
		this.fee = fee;
		this.eligibilty = eligibilty;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Qualification getEligibilty() {
		return eligibilty;
	}

	public void setEligibilty(Qualification eligibilty) {
		this.eligibilty = eligibilty;
	}

	public int getCourseId() {
		return courseId;
	}
	
	
	
}
