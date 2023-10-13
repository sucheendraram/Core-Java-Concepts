package corejava.exceptions;

import java.util.Scanner;

public class CustomExceptionsExample {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter value for a");
			int a = scan.nextInt();
			System.out.println("Enter value for b");
			int b = scan.nextInt();
			if(a > b) {
				System.out.println("The difference is "+(a - b));
			} else {
				//Create a custom Exception object and throw it
				throw new ALessThanBException();
			}
		} catch (ALessThanBException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
