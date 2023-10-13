package corejava.inheritance;

public class InheritanceExampleApplication {

	public static void main(String[] args) {
		Teaching t1 = new Teaching("ExcelR1235", "Ashok", 9986865422l, 40000, "CS", "Padma Reddy");
		t1.display();
		Technical tech1 = new Technical("ExcelR3312", "Faizal", 9902765432l, 35000, "Java, C++, Python");
		tech1.display();
		Contract c1 = new Contract("ExcelR0008", "Harsha", 9908087878l, 32000, 12);
	    c1.display();
	}
}
