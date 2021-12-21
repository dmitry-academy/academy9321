package by.academy.lesson19.treads;

public class CreateThreadExample {

	public static void main(String[] args) {

//		Thread t = Thread.currentThread();
//
//		System.out.println(t.getName());
//		System.out.println(t);

		RunnableImpl mThing = new RunnableImpl();

		Thread myThready1 = new Thread(mThing);
		myThready1.start();
		
		Thread myTread = new MyThread();
		myTread.start();
		
//		Thread myThready2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Hello from separate thread! Method 2");
//			}
//		});
//		myThready2.start();

		System.out.println("The main thread finished...");
	}
}
