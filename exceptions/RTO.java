package corejava.exceptions;

import java.util.Scanner;

public class RTO {
	int age;

	void collectAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		age = scan.nextInt();
	}

	void dispatchDL() {
		try {
			if (age < 18) {
				throw new UnderAgeException();
			} else if (age > 60) {
				throw new OverAgeException();
			} else {
				System.out.println("Please collect the DL");
			}
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		} catch (OverAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
