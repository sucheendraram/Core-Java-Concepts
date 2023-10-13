package corejava.exceptions;

import java.util.Scanner;

public class ManuallyThrowException {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter value for a");
			int a = scan.nextInt();
			System.out.println("Enter value for b");
			int b = scan.nextInt();
			if(b == 0) {
				//Manually throw an Exception object
				 Exception e = new Exception("Dinominator is zero. Division not possible");
				 throw e;
			}
			int c = a / b;
			System.out.println("The result is " + c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}

}
