package corejava.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocksExample {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			int arr[] = new int[5];
			System.out.println("Enter value for a");
			int a = scan.nextInt();
			System.out.println("Enter value for b");
			int b = scan.nextInt();
			int c = a / b;
			System.out.println("The result is " + c);
			System.out.println("Enter the array index");
			int index = scan.nextInt();
			arr[index] = 15;
		} catch (InputMismatchException e) {
			System.out.println("Something went wrong with the input provided. please try again later!");
		} catch (ArithmeticException e) {
			System.out.println("Trying to divide a number by zero. ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Something went wrong while accessing the array. please try again later!");
		} catch (Exception e) {
			System.out.println("Something went wrong please try again later!");
		}
		System.out.println("Program terminated normally");
	}
}
