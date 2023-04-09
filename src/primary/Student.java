package primary;

import java.util.Arrays;

public class Student extends Person {

	private int startYear;
	private int academicDuration;
	private int[] grades;
	
	
	/**
	 * @param name
	 * @param birthYear
	 * @param phoneNumber
	 */
	public Student(String name, int birthYear, String phoneNumber) {
		super(name, birthYear, phoneNumber);
		this.startYear = 0;
		this.academicDuration = 0;
		this.grades = new int[50];
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param startYear
	 * @param academicDuration
	 * @param grades
	 */
	
	
	public Student(String name, int birthYear, String phoneNumber, int startYear, int academicDuration, int[] grades) {
		super(name, birthYear, phoneNumber);
		this.startYear = startYear;
		this.academicDuration = academicDuration;
		this.grades = grades;
	}


	/**
	 * @param startYear
	 * @param academicDuration
	 */
	public Student(String name, int birthYear, String phoneNumber, int startYear, int academicDuration) {
		super(name, birthYear, phoneNumber);
		this.startYear = startYear;
		this.academicDuration = academicDuration;
		this.grades = new int[50];
	}


	public int getStartYear() {
		return startYear;
	}


	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}


	public int getAcademicDuration() {
		return academicDuration;
	}


	public void setAcademicDuration(int academicDuration) {
		this.academicDuration = academicDuration;
	}


	public int[] getGrades() {
		return grades;
	}


	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	
	public int avgGrade() {
		int sum = 0;
		for (int grade : grades) {
			sum += grade;
		}
		return sum;
	}
	
	public int calExpired() {
		return startYear + academicDuration;
	}


	@Override
	public String toString() {
		return "Student [" + super.toString() +  "startYear=" + startYear + ", academicDuration=" + academicDuration + ", grades="
				+ Arrays.toString(grades) + "]";
	}

}
