package corejava.inheritance;

public class Technical extends Staff {
	String skills;
	
	Technical(String sId, String n, long pNo, int s, String sk){
		staffId = sId;
		name = n;
		phNo = pNo;
		salary = s;
		skills = sk;
	}
	
	@Override
	void display() {
		System.out.println("Displaying contents of Technical staff member");
		System.out.println("ID of the Tech member is "+staffId);
		System.out.println("Name of the Tech member is "+name);
		System.out.println("Phone number of the Tech member is "+phNo);
		System.out.println("Salary of the Tech member is "+salary);
		System.out.println("Skills of the Tech member is "+skills);
	}
}
