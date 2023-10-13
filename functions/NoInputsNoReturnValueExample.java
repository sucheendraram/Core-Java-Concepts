package corejava.functions;

class CalculatorExample {
	int add(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
	
}

public class NoInputsNoReturnValueExample {
	public static void main(String[] args) {
		CalculatorExample c1 = new CalculatorExample();
		int res = c1.add(10, 20);
		System.out.println("The sum is "+res);
	}
}
