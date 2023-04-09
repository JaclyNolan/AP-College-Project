package primary;

import java.util.Arrays;

public class Janitor extends Person {
	String[] classroom;

	/**
	 * @param name
	 * @param birthYear
	 * @param phoneNumber
	 */
	public Janitor(String name, int birthYear, String phoneNumber) {
		super(name, birthYear, phoneNumber);
		this.classroom = new String[50];
	}

	/**
	 * @param classroom
	 */
	public Janitor(String name, int birthYear, String phoneNumber, String[] classroom) {
		super(name, birthYear, phoneNumber);
		this.classroom = classroom;
	}

	public String[] getClassroom() {
		return classroom;
	}

	public void setClassroom(String[] classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "Janitor [" + super.toString() + "classroom=" + Arrays.toString(classroom) + "]";
	}
	
	
}
