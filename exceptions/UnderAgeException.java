package corejava.exceptions;

public class UnderAgeException extends Exception {
	@Override
	public String getMessage() {
		return "Age is lesser that 18. Minimum age must be atleast 18 to get the DL. ";
	}
}
