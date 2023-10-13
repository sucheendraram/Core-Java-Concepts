package corejava.exceptions;

public class OverAgeException extends Exception {
	@Override
	public String getMessage() {
		return "Age is greater than 60. Maximum age to get the DL is 59 years";
	}
}
