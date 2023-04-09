package primary;

public abstract class Person {
	private int id;
	private String name;
	private int birthYear;
	private String phoneNumber;
	private static int count = 0;
	
	
	/**
	 * @param id
	 * @param name
	 * @param birthYear
	 * @param phoneNumber
	 */
	public Person() {
		count++;
		this.id = count;
		this.name = "";
		this.birthYear = 0;
		this.phoneNumber = "";
	}
	
	public Person(String name, int birthYear, String phoneNumber) {
		count++;
		this.id = count;
		this.name = name;
		this.birthYear = birthYear;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public int getAge() {
		return 2023 - birthYear;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", birthYear=" + birthYear + ", phoneNumber=" + phoneNumber
				+ ", ";
	}
	
	
}
