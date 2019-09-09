package chapter10.exercises;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
	}
	public WrongPasswordException(String message) {
		super(message);
	}
}
