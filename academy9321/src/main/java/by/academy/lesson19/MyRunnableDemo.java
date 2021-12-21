package by.academy.lesson19;

public class MyRunnableDemo {
	public static void main(String[] args) {
//		2.	Создать класс, реализующий интерфейс Runnable. 
//		Переопределить run() метод. Создать цикл for. 
//		В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка. 
//		Используем статический метод Thread.sleep() чтобы сделать паузу. 
//		Создать три потока, выполняющих задачу распечатки значений.
		
		
		MyRunnable myRunnable = new MyRunnable();

		Thread thread1 = new Thread(myRunnable, "Вася");
		Thread thread2 = new Thread(myRunnable);
		Thread thread3 = new Thread(myRunnable);

		thread1.start();
		thread2.start();
		thread3.start();

		System.out.println(thread1.getName());

		System.out.println(Thread.currentThread().getPriority());
		System.out.println(thread1.getPriority());

	}
}