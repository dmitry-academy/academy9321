package by.academy.lesson20.volatiles;

public class TaskRunner {

	private volatile static int number;
	private volatile static boolean ready;

	private static class Reader extends Thread {

		@Override
		public void run() {
			while (!ready) {
				Thread.yield();
			}

			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		new Reader().start();
		number = 42;
		ready = true;
	}
}