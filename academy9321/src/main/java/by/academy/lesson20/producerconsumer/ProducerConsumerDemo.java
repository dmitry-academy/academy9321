package by.academy.lesson20.producerconsumer;

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		Store store = new Store();
		Producer producer1 = new Producer(store);
		Producer producer2 = new Producer(store);

		Consumer consumer1 = new Consumer(store);
		Consumer consumer2 = new Consumer(store);
		Consumer consumer3 = new Consumer(store);
		Consumer consumer4 = new Consumer(store);

		new Thread(consumer1, "Consumer 1").start();
		new Thread(consumer2, "Consumer 2").start();
		new Thread(consumer3, "Consumer 3").start();
		new Thread(consumer4, "Consumer 4").start();
		new Thread(producer1, "Producer 1").start();
		new Thread(producer2, "Producer 2").start();

	}
}
