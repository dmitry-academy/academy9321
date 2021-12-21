package by.academy.lesson20.producerconsumer;

class Store {

	private int product = 0;

	public synchronized void get() {
		while (product < 1) {
			try {
				wait();
				System.out.println("Ждем ресурс");
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
		product--;
		System.out.println(Thread.currentThread().getName() + "Consumer got 1 product. Number of products: " + product);
		notify();
	}

	public synchronized void put() {
		while (product >= 8) {
			try {
				wait();
				System.out.println("Ждем место");
			} catch (InterruptedException e) {
				System.out.println(e);

			}
		}
		product++;
		System.out
				.println(Thread.currentThread().getName() + "Producer added 1 product. Number of products: " + product);
		notify();
	}

}