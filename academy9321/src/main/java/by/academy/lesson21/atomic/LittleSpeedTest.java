package by.academy.lesson21.atomic;

import java.util.Formatter;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class LittleSpeedTest implements Runnable {
	private static volatile int var1 = 0;
	private static AtomicInteger var2 = new AtomicInteger(0);
	private static final int LOOP_COUNT = 10_000_000;
//	private static final int LOOP_COUNT = 1_000_000;
	private static AtomicLong volatileTime = new AtomicLong(0);
	private static AtomicLong atomicTime = new AtomicLong(0);

	@Override
	public void run() {
		final long t1, t2, t3;
		t1 = System.nanoTime();
		for (int i = 0; i < LOOP_COUNT; i++) {
			var1 += 1;
		}
		t2 = System.nanoTime();
		for (int i = 0; i < LOOP_COUNT; i++) {
			var2.incrementAndGet();
		}
		t3 = System.nanoTime();

		volatileTime.addAndGet(t2 - t1);
		atomicTime.addAndGet(t3 - t2);
	}

	private static String ls(long val) {
		return new Formatter().format("%,12d", val).toString();

	}

	public static void main(String[] args) throws InterruptedException {
		Thread thArr[] = new Thread[10];
		for (int i = 0; i < thArr.length; i++) {
			LittleSpeedTest lst = new LittleSpeedTest();
			thArr[i] = new Thread(lst);
			thArr[i].start();
		}
		for (int i = 0; i < thArr.length; i++) {
			thArr[i].join();
		}
		System.out.println("volatile var manipulation time is " + volatileTime.get() + " ns");
		System.out.println("atomic   var manipulation time is " + atomicTime.get() + " ns");
		System.out.println("Seems, atomic is slower, but let's compare values... ");
		System.out.println("volatile int must be " + ls(LOOP_COUNT * thArr.length) + ", but it is " + ls(var1));
		System.out.println("Atomic   int must be " + ls(LOOP_COUNT * thArr.length) + ", but it is " + ls(var2.get()));
	}
}