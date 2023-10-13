package corejava.inheritance;

public class Staff {
	String staffId;
	String name;
	long phNo;
	int salary;
	
	void display() {
		System.out.println("Displaying contents of staff member");
		System.out.println("ID is "+staffId);
		System.out.println("Name is "+name);
		System.out.println("Phone number is "+phNo);
		System.out.println("Salary is "+salary);
	}
}
