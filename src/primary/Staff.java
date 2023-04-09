package primary;

public class Staff extends Person {
	int startYear;
	String responsibility;
	/**
	 * @param name
	 * @param birthYear
	 * @param phoneNumber
	 */
	public Staff(String name, int birthYear, String phoneNumber) {
		super(name, birthYear, phoneNumber);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param startYear
	 * @param responsibility
	 */
	public Staff(String name, int birthYear, String phoneNumber, int startYear, String responsibility) {
		super(name, birthYear, phoneNumber);
		this.startYear = startYear;
		this.responsibility = responsibility;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	@Override
	public String toString() {
		return "Staff [" + super.toString() + "startYear=" + startYear + ", responsibility=" + responsibility + "]";
	}
	
	
}
