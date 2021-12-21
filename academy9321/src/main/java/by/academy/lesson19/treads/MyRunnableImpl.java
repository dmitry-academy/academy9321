package by.academy.lesson19.treads;

public class MyRunnableImpl implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1);
				System.out.println("implements Runnable: " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}