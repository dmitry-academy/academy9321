package by.academy.lesson19.treads;

public class InfinityThread extends Thread {

	@Override
	public void run() {
		for (;;) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("-----------------Infinity thread");
		}
	}

}
