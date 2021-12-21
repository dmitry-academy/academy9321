package by.academy.lesson19.treads.yield;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " in control: " + i);
		}
		System.out.println(Thread.currentThread().getName() + " finished");
	}
}
