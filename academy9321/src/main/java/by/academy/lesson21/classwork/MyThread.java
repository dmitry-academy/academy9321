package by.academy.lesson21.classwork;

public class MyThread extends Thread {

	private StringBuilder sb;

	public MyThread(StringBuilder sb) {
		super();
		this.sb = sb;
	}

	@Override
	public void run() {
		synchronized (sb) {
			for (int i = 0; i < 3; i++) {
				System.out.println(sb.charAt(0));
			}
			char c = sb.charAt(0);
			sb.setCharAt(0, ++c);
		}
	}
}
