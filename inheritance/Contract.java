package corejava.inheritance;

public class Contract extends Staff {
	int timePeriod;
	
	Contract(String sId, String n, long pNo, int s, int t ){
		staffId = sId;
		name = n;
		phNo = pNo;
		salary = s;
		timePeriod = t;
	}
	
	@Override
	void display() {
		System.out.println("Displaying contents of Contract staff member");
		System.out.println("ID is "+staffId);
		System.out.println("Name is "+name);
		System.out.println("Phone number is "+phNo);
		System.out.println("Salary is "+salary);
		System.out.println("Time period is "+timePeriod);
	}
}
