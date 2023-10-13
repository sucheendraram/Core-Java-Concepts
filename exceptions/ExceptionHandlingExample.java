package corejava.exceptions;

import java.util.Scanner;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter value for a");
			int a = scan.nextInt();
			System.out.println("Enter value for b");
			int b = scan.nextInt();
			int c = a / b;
			System.out.println("The result is " + c);

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Something went wrong. please try again later!");
		}
		System.out.println("Program terminated normally");
	}
}
