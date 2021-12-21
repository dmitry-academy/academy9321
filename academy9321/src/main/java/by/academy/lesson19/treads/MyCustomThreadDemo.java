package by.academy.lesson19.treads;

public class MyCustomThreadDemo {
	// 1. Реализовать поток с помощью Thread (extends Thread),
	// переопределить метод run
	// В методе run в цикле вывести 100 раз строку:
	// Поток реализован с помощью extends Thread
	// 2. Реализовать поток с помощью Runnable (implements Runnable)
	// переопределить метод run
	// В методе run в цикле вывести 100 раз строку:
	// Поток реализован с помощью implements Runnable
	// 3. Создать класс для проверки ThreadDemo, в методе main запустить оба потока.
	// thread.start();
	// 4. Создать поток демон, в котором будет бесконечный цикл выводить 
	// на экран строку: Я поток демон!
	
	// 5. method sleep: Создать 2 класса, наследника Thread с именем Chicked and
	// Egg.
	// В каждый класс добавляем цикл 12 итераций, в котором усыпляем поток на 1000 мс,
	// затем выводим на экран строку Chicken или Egg, в зависимости от класса.
	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		System.out.println(mainThread.getPriority());
		System.out.println(mainThread.getId());
		System.out.println(mainThread.isDaemon());
		System.out.println("---------");
//		Thread infinity = new InfinityThread();
//		infinity.setDaemon(true);
//		infinity.start();
//
//		Thread infinity1 = new InfinityThread();
//		infinity1.setDaemon(true);
//		infinity1.start();
		MyThread thread = new MyThread();


		Runnable runnable = new MyRunnableImpl();
		Thread thread1 = new Thread(runnable);
		

		Runnable runnableLambda = () -> {

			for (int i = 0; i < 100; i++) {
				try {
					Thread.sleep(1);
					System.out.println("runnableLambda: " + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};
		Thread thread2 = new Thread(runnableLambda);
		
		thread.setPriority(Thread.MAX_PRIORITY);
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
//		thread.run();
		thread.start();
//		thread.start();
		thread1.start();
		thread2.start();

	}

}
