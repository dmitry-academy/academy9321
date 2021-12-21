package by.academy.lesson19.treads;

class RunnableImpl implements Runnable {

	// This method will be run in separate thread
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello from separate thread! Method 1: " + i);
		}
	}
}
