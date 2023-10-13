package corejava.functions;

class Adder {
	void add() {
		int num1, num2, sum;
		num1 = 10;
		num2 = 20;
		sum = num1 + num2;
		System.out.println("The sum is "+sum);
	}
	
	void add(int a, int b) {
		int res;
		res = a + b;
		System.out.println(res);
	}
	
	void add(float a, float b) {
		float res;
		res = a + b;
		System.out.println(res);
	}
	
	void add(double a, double b) {
		double res;
		res = a + b;
		System.out.println(res);
	}
	
	void add(int a, float b) {
		float res;
		res = a + b;
		System.out.println(res);
	}
	
	void add(float a, int b) {
		float res;
		res = a + b;
		System.out.println(res);
	}
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
		Adder adder = new Adder();
		adder.add();
		adder.add(20,30);
		adder.add(11.23f, 12.12f);
		adder.add(13123.1313, 313141.414141);
		adder.add(10, 21.2f);
		adder.add(13.12f, 21);
	}

}
