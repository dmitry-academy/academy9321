package by.academy.lesson19.treads.deamon;

public class WhileThread extends Thread {
	private int i = 0;

	public WhileThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (;;) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Infinity thread!" + i++);
		}
	}

}
