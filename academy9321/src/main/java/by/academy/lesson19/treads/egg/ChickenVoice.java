package by.academy.lesson19.treads.egg;

public class ChickenVoice {

	public static void main(String... args) {

		EggVoice eggThread = new EggVoice();
		eggThread.setPriority(10);
		System.out.println("Disput starting...");
		
		eggThread.start();

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000); // explain this part
			} catch (InterruptedException e) {
				System.err.println(e);
			}

			System.out.println("Chicken!");
		}

		// if egg thread still alive...
		if (eggThread.isAlive()) {
			try {
				eggThread.join(); // wait chicken
			} catch (InterruptedException e) {
				System.err.println(e);
			}
			System.out.println("Egg first!!!");
			// if chicken finished
		} else {
			System.out.println("Chicken first!!!");
		}

		System.out.println("Dispute finished!");
	}
}
