package corejava.inheritance;

public class Teaching extends Staff {
	String domain;
	String publications;

	Teaching(String sId, String n, long pNo, int s, String d, String p) {
		staffId = sId;
		name = n;
		phNo = pNo;
		salary = s;
		domain = d;
		publications = p;
	}

	@Override
	void display() {
		System.out.println("Displaying contents of Teaching staff member");
		System.out.println("Teacher Id is " + staffId);
		System.out.println("Teacher name is " + name);
		System.out.println("Teacher Phone number is " + phNo);
		System.out.println("Teacher Salary is " + salary);
		System.out.println("Teacher Domain is " + domain);
		System.out.println("Teacher Publications are " + publications);
	}

}
