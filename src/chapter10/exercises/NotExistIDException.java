package chapter10.exercises;

public class NotExistIDException extends Exception {
	public NotExistIDException() {
	}
	
	public NotExistIDException(String message) {
		super(message);
	}
}	
