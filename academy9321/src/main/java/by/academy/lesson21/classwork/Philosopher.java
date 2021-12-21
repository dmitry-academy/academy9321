package by.academy.lesson21.classwork;

public class Philosopher extends Thread {

	private Object leftFork;
	private Object rightFork;

	public Philosopher(Object leftFork, Object rightFork) {
		super();
		this.leftFork = leftFork;
		this.rightFork = rightFork;
	}

	@Override
	public void run() {

	}

}
