package primary;

public class Teacher extends Person {
	int startYear;
	double salary;
	
	/**
	 * @param name
	 * @param birthYear
	 * @param phoneNumber
	 */
	public Teacher(String name, int birthYear, String phoneNumber) {
		super(name, birthYear, phoneNumber);
		this.startYear = 0;
		this.salary = 0;
	}
	/**
	 * @param startYear
	 * @param salary
	 */
	public Teacher(String name, int birthYear, String phoneNumber, int startYear, double salary) {
		super(name, birthYear, phoneNumber);
		this.startYear = startYear;
		this.salary = salary;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [" + super.toString() + "startYear=" + startYear + ", salary=" + salary + "]";
	}
	
}
