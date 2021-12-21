package by.academy.lesson19.treads;

public class DeamonDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			DaemonThread t1 = new DaemonThread(i + " thread 1 p10");
			DaemonThread t2 = new DaemonThread(i + " thread 2 p5");
			DaemonThread t3 = new DaemonThread(i + " thread 3 p1");

			t1.setPriority(10);
			t2.setPriority(5);
			t3.setPriority(1);
			t1.start();
			t2.start();

			// Setting user thread t3 to Daemon
			t3.start();
		}

//		WhileThread whileThread = new WhileThread("t4");
//		whileThread.setDaemon(true);
//		whileThread.start();
		// Setting user thread t1 to Daemon

		// starting first 2 threads

		System.out.println("END!");
	}
}
