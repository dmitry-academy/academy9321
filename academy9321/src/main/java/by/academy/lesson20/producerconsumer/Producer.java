package by.academy.lesson20.producerconsumer;
class Producer implements Runnable {

	private Store store;

	public Producer(Store store) {
		this.store = store;
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			store.put();
		}
	}
}