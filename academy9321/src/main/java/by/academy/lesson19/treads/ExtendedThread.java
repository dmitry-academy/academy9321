package by.academy.lesson19.treads;

public class ExtendedThread extends Thread {
	@Override
	public void run() {
		System.out.println("Hello from separate thread!");
	}
}
