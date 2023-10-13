package corejava.exceptions;

public class ALessThanBException extends Exception {
	
	@Override
	public String getMessage() {
		return "Error in input. a < b. Subtraction not possible";
	}
}
