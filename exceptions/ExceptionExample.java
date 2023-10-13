package corejava.exceptions;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for a");
		int a = scan.nextInt();
		System.out.println("Enter value for b");
		int b = scan.nextInt();
		int c = a / b;
		System.out.println("The result is "+c);
		System.out.println("Program terminated normally");
	}

}
