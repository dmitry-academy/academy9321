package by.academy.lesson19.treads;

public class ThreadExtendsDemo {

	public static void main(String[] args) throws InterruptedException {

		ExtendedThread thread = new ExtendedThread();
		thread.start();

		System.out.println("Main thread finished...");
	}
}
