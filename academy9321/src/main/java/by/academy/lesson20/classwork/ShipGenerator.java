package by.academy.lesson20.classwork;

import java.util.Random;

public class ShipGenerator extends Thread {

	private Port port;
	private Random rand = new Random();

	public ShipGenerator(Port port) {
		super();
		this.port = port;
	}

	@Override
	public void run() {
		for (;;) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Ship ship = new Ship(port, getRandomInt(), getRandomBoolean());
			System.out.println("Приплыл корабл: " + ship);
			new Thread(ship).start();
		}
	}

	private int getRandomInt() {
		return rand.nextInt(5) + 1;
	}

	private boolean getRandomBoolean() {
		return rand.nextBoolean();
	}
}
