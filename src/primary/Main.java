package primary;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static ArrayList<Person> list = new ArrayList<Person>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] temp = {10, 9, 8, 7, 6};
		list.add(new Student("Jacly", 2003, "0862351477", 2021,  2, temp));
		list.add(new Teacher("Cuong", 1982, "0986325851", 2017, 10000000));
		
		int option;
		
		do {
			option = printMenu();
			switch (option) {
			case 1: { //Add
				int option2;
				do {
				option2 = addMenu();
					switch (option2) {
					case 1: { //Student
						addStudent();
						break;
					}
					case 2: { //Teacher
						addTeacher();
						break;
					}
					case 3: { //Staff
						addStaff();
						break;
					}
					case 4: { //Janitor
						addJanitor();
						break;
					}
					case 5: //
						closingMenu();
						break;
					}
				} while (option2 != 5);
				
				break;
			}
			case 2: {//Edit
				int option2;
				do {
				option2 = editMenu();
					switch (option2) {
					case 1: {
						editStudent();
						break;
					}
					case 2: {
						editTeacher();
						break;
					}
					case 3: {
						editStaff();
						break;
					}
					case 4: {
						editJanitor();
						break;
					}
					case 5:
						closingMenu();
						break;
					}
				} while (option2 != 5);
				break;
			}	
			case 3: {
				int option2;
				do {
				option2 = deleteMenu();
					switch (option2) {
					case 1: {
						deleteStudent();
						break;
					}
					case 2: {
						deleteTeacher();
						break;
					}
					case 3: {
						deleteStaff();
						break;
					}
					case 4: {
						deleteJanitor();
						break;
					}
					case 5:
						closingMenu();
						break;
					}
				} while (option2 != 5);
				break;
			}
			case 4: {
				int option2;
				do {
				option2 = searchMenu();
					switch (option2) {
					case 1: {
						searchStudent();
						break;
					}
					case 2: {
						searchTeacher();
						break;
					}
					case 3: {
						searchStaff();
						break;
					}
					case 4: {
						searchJanitor();
						break;
					}
					case 5:
						closingMenu();
						break;
					}
				} while (option2 != 5);
				break;
			}
			case 5:
				int option2;
				do {
				option2 = displayMenu();
					switch (option2) {
					case 1: {
						displayStudent();
						break;
					}
					case 2: {
						displayTeacher();
						break;
					}
					case 3: {
						displayStaff();
						break;
					}
					case 4: {
						displayJanitor();
						break;
					}
					case 5: {
						displayAll();
						break;
					}
					case 6:
						closingMenu();
						break;
					default: 
						System.out.println("Invalid!");
						divideMenu();
						break;
					}
				} while (option2 != 6);
				break;
			case 6:
				System.out.println("Closing!");
				break;
			default:
				System.out.println("Invalid input.");
				break;
			}
		} while (option != 6);
		sc.close();
	}
	
	static int printMenu() {
		// Print Menu
		System.out.println("Welcome to BTEC's Personnel Management!");
		System.out.println("1. Add");
		System.out.println("2. Edit");
		System.out.println("3. Delete");
		System.out.println("4. Search");
		System.out.println("5. Display");
		System.out.println("6. Exit");
		divideMenu();
		
		int option = sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	static int addMenu() {
		// Print Menu
		
		System.out.println("Add what?");
		System.out.println("1. Add Student");
		System.out.println("2. Add Teacher");
		System.out.println("3. Add Staff");
		System.out.println("4. Add Janitor");
		System.out.println("5. Exit");
		divideMenu();
		
		int option = sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	static int deleteMenu() {
		// Print Menu
		
		System.out.println("Delete what?");
		System.out.println("1. Delete Student");
		System.out.println("2. Delete Teacher");
		System.out.println("3. Delete Staff");
		System.out.println("4. Delete Janitor");
		System.out.println("5. Exit");
		divideMenu();
		
		int option = sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	static int displayMenu() {
		// Print Menu
		
		System.out.println("Display what?");
		System.out.println("1. Display Student");
		System.out.println("2. Display Teacher");
		System.out.println("3. Display Staff");
		System.out.println("4. Display Janitor");
		System.out.println("5. Display All");
		System.out.println("6. Exit");
		divideMenu();
		
		int option = sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	static int searchMenu() {
		// Print Menu

		System.out.println("Search what?");
		System.out.println("1. Search Student");
		System.out.println("2. Search Teacher");
		System.out.println("3. Search Staff");
		System.out.println("4. Search Janitor");
		System.out.println("5. Exit");
		divideMenu();
		
		int option = sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	static int editMenu() {
		// Print Menu

		System.out.println("Edit what?");
		System.out.println("1. Edit Student");
		System.out.println("2. Edit Teacher");
		System.out.println("3. Edit Staff");
		System.out.println("4. Edit Janitor");
		System.out.println("5. Exit");
		divideMenu();
		
		int option = sc.nextInt();
		sc.nextLine();
		return option;
	}

	static void closingMenu() {
		System.out.println("Closing!");
		divideMenu();
	}
	
	static void divideMenu() {
		System.out.println("---------------------------------------");
	}
	
	static void addStudent() {
		System.out.println("Add Student:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Birth year: ");
		int birthYear = sc.nextInt(); sc.nextLine();
		
		System.out.print("Phone number: ");
		String phoneNumber = sc.nextLine();
		
		System.out.print("Starting school year: ");
		int startYear = sc.nextInt(); sc.nextLine();
		
		System.out.print("Academic duration: ");
		int academicDuration = sc.nextInt(); sc.nextLine();
		
		System.out.print("Add how many grades?: ");
		int n = sc.nextInt(); sc.nextLine();
		
		int[] grades = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Grade [" + (i + 1) + "]: ");
			grades[i] = sc.nextInt();
		}
		sc.nextLine();
		
		list.add(new Student(name, birthYear, phoneNumber, startYear, academicDuration, grades));
		divideMenu();
	}

	static void addTeacher() {
		System.out.println("Add Teacher:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Birth year: ");
		int birthYear = sc.nextInt(); sc.nextLine();
		
		System.out.print("Phone number: ");
		String phoneNumber = sc.nextLine();
		
		System.out.print("Starting teaching year: ");
		int startYear = sc.nextInt(); sc.nextLine();
		
		System.out.print("Salary: ");
		double salary = sc.nextDouble(); sc.nextLine();
		
		list.add(new Teacher(name, birthYear, phoneNumber, startYear, salary));
		divideMenu();
	}

	static void addStaff() {
		System.out.println("Add Staff:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Birth year: ");
		int birthYear = sc.nextInt(); sc.nextLine();
		
		System.out.print("Phone number: ");
		String phoneNumber = sc.nextLine();
		
		System.out.print("Starting teaching year: ");
		int startYear = sc.nextInt(); sc.nextLine();
		
		System.out.print("Responsibility: ");
		String responsibility = sc.nextLine();
		
		list.add(new Staff(name, birthYear, phoneNumber, startYear, responsibility));
		divideMenu();
	}

	static void addJanitor() {
		System.out.println("Add Staff:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Birth year: ");
		int birthYear = sc.nextInt(); sc.nextLine();
		
		System.out.print("Phone number: ");
		String phoneNumber = sc.nextLine();
		
		System.out.print("Add how many classrooms?: ");
		int n = sc.nextInt(); sc.nextLine();
		
		String[] classrooms = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Classrooms [" + (i + 1) + "]: ");
			classrooms[i] = sc.nextLine();
		}
		
		list.add(new Janitor(name, birthYear, phoneNumber, classrooms));
		divideMenu();
	}
	
	static void editStudent() {
		System.out.print("Edit Student by id: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Student) {
				Student student = (Student) list.get(i);
				
				if (student.getId() == input) {
					isFound = true;
					System.out.println("Edit Student with id=" + student.getId() + ":");
					System.out.print("Name: ");
					sc.nextLine();
					String name = sc.nextLine();
					
					System.out.print("Birth year: ");
					int birthYear = sc.nextInt(); sc.nextLine();
					
					System.out.print("Phone number: ");
					String phoneNumber = sc.nextLine();
					
					System.out.print("Starting school year: ");
					int startYear = sc.nextInt(); sc.nextLine();
					
					System.out.print("Academic duration: ");
					int academicDuration = sc.nextInt(); sc.nextLine();
					
					System.out.print("Add how many grades?: ");
					int n = sc.nextInt(); sc.nextLine();
					
					int[] grades = new int[n];
					
					for (int ii = 0; ii < n; ii++) {
						System.out.print("Grade [" + (ii + 1) + "]: ");
						grades[ii] = sc.nextInt(); sc.nextLine();
					}
					
					student.setGrades(grades);
					student.setAcademicDuration(academicDuration);
					student.setBirthYear(birthYear);
					student.setName(name);
					student.setPhoneNumber(phoneNumber);
					student.setStartYear(startYear);
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}
	
	static void editTeacher() {
		System.out.print("Edit Teacher by id: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Teacher) {
				Teacher teacher = (Teacher) list.get(i);
				
				if (teacher.getId() == input) {
					isFound = true;
					System.out.println("Edit Teacher with id=" + teacher.getId() + ":");
					sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					
					System.out.print("Birth year: ");
					int birthYear = sc.nextInt(); sc.nextLine();
					
					System.out.print("Phone number: ");
					String phoneNumber = sc.nextLine();
					
					System.out.print("Starting teaching year: ");
					int startYear = sc.nextInt(); sc.nextLine();
					
					System.out.print("Salary: ");
					double salary = sc.nextDouble(); sc.nextLine();
					
					teacher.setBirthYear(birthYear);
					teacher.setName(name);
					teacher.setPhoneNumber(phoneNumber);
					teacher.setSalary(salary);
					teacher.setStartYear(startYear);
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}
	
	static void editStaff() {
		System.out.print("Edit Staff by id: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Staff) {
				Staff staff = (Staff) list.get(i);
				
				if (staff.getId() == input) {
					isFound = true;
					System.out.println("Edit Staff with id=" + staff.getId() + ":");
					sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					
					System.out.print("Birth year: ");
					int birthYear = sc.nextInt(); sc.nextLine();
					
					System.out.print("Phone number: ");
					String phoneNumber = sc.nextLine();
					
					System.out.print("Starting teaching year: ");
					int startYear = sc.nextInt(); sc.nextLine();
					
					System.out.print("Responsibility: ");
					String responsibility = sc.nextLine();
					
					staff.setBirthYear(birthYear);
					staff.setStartYear(startYear);
					staff.setName(name);
					staff.setPhoneNumber(phoneNumber);
					staff.setResponsibility(responsibility);
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}

	static void editJanitor() {
		System.out.print("Edit Janitor by id: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Janitor) {
				Janitor staff = (Janitor) list.get(i);
				
				if (staff.getId() == input) {
					isFound = true;
					System.out.println("Edit Staff with id=" + staff.getId() + ":");
					sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					
					System.out.print("Birth year: ");
					int birthYear = sc.nextInt(); sc.nextLine();
					
					System.out.print("Phone number: ");
					String phoneNumber = sc.nextLine();
					
					System.out.print("Add how many classrooms?: ");
					int n = sc.nextInt(); sc.nextLine();
					
					String[] classrooms = new String[n];
					
					for (int ii = 0; ii < n; ii++) {
						System.out.print("Classrooms [" + (ii + 1) + "]: ");
						classrooms[ii] = sc.nextLine();
					}
					
					
					staff.setBirthYear(birthYear);
					staff.setName(name);
					staff.setPhoneNumber(phoneNumber);
					staff.setClassroom(classrooms);
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}

	static void deleteStudent() {
		System.out.print("Delete Student by code: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Student) {
				
				if (list.get(i).getId() == input) {
					isFound = true;
					list.remove(list.get(i));
					System.out.println("Deleted successfully!");
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}

	static void deleteTeacher() {
		System.out.print("Delete Teacher by code: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Teacher) {
				
				if (list.get(i).getId() == input) {
					isFound = true;
					list.remove(list.get(i));
					System.out.println("Deleted successfully!");
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}

	static void deleteStaff() {
		System.out.print("Delete Staff by code: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Staff) {
				
				if (list.get(i).getId() == input) {
					isFound = true;
					list.remove(list.get(i));
					System.out.println("Deleted successfully!");
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}

	static void deleteJanitor() {
		System.out.print("Delete Janitor by code: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Janitor) {
				
				if (list.get(i).getId() == input) {
					isFound = true;
					list.remove(list.get(i));
					System.out.println("Deleted successfully!");
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}
	
	static void searchStudent() {
		System.out.print("Search Student by code: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Student) {
				
				if (list.get(i).getId() == input) {
					isFound = true;
					System.out.println(list.get(i).toString());
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}
	
	static void searchTeacher() {
		System.out.print("Search Teacher by code: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Teacher) {
				
				if (list.get(i).getId() == input) {
					isFound = true;
					System.out.println(list.get(i).toString());
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}

	static void searchStaff() {
		System.out.print("Search Staff by code: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Staff) {
				
				if (list.get(i).getId() == input) {
					isFound = true;
					System.out.println(list.get(i).toString());
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}

	static void searchJanitor() {
		System.out.print("Search Janitor by code: ");
		int input = sc.nextInt();
		boolean isFound = false;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Janitor) {
				
				if (list.get(i).getId() == input) {
					isFound = true;
					System.out.println(list.get(i).toString());
					break;
				}
			}
		}
		if (!isFound) System.out.println("Not Found!");
		divideMenu();
	}
	
	static void displayStudent() {
		System.out.println("Display Student:");
		int count = 0;
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Student) {
				count++;
				System.out.println(count + ". " + list.get(i).toString());
			}
		}
		System.out.println("Successfully displayed " + count + " student(s)");
		divideMenu();
	}
	
	static void displayTeacher() {
		System.out.println("Display Teacher:");
		int count = 0;
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Teacher) {
				count++;
				System.out.println(count + ". " + list.get(i).toString());
			}
		}
		System.out.println("Successfully displayed " + count + " teacher(s)");
		divideMenu();
	}

	static void displayStaff() {
		System.out.println("Display Staff:");
		int count = 0;
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Staff) {
				count++;
				System.out.println(count + ". " + list.get(i).toString());
			}
		}
		System.out.println("Successfully displayed " + count + " staff(s)");
		divideMenu();
	}

	static void displayJanitor() {
		System.out.println("Display Janitor:");
		int count = 0;
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) instanceof Janitor) {
				count++;
				System.out.println(count + ". " + list.get(i).toString());
			}
		}
		System.out.println("Successfully displayed " + count + " janitor(s)");
		divideMenu();
	}

	static void displayAll() {
		System.out.println("Display All:");
		int count = 0;
		
		for (int i = 0; i < list.size(); i++) {
			count++;
			System.out.println(count + ". " + list.get(i).toString());
		}
		System.out.println("Successfully displayed " + count + " person(s)");
		divideMenu();
	}
	
}
