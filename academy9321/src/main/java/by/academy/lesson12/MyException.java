package by.academy.lesson12;

public class MyException extends Exception {
	private int detail;

	/***
	 * 
	 * @author dmitrysc asdasdasd
	 */
	public MyException(int detail, String message) {
		super(message);
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "MyException{" + "detail=" + detail + ", message=" + getMessage() + "} ";
	}
}
