package by.academy.lesson19.treads;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				sleep(1);
				System.out.println("extends Thread: " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
