package by.academy.lesson20.classwork;

import java.util.LinkedList;

public class PortDemo {

	public static void main(String... args) {
		LinkedList<Dock> docks = new LinkedList<>();

		docks.add(new Dock(0, "Alfa"));
		docks.add(new Dock(0, "Beta"));
		docks.add(new Dock(0, "Gamma"));

		Port port = new Port(docks);
		new ShipGenerator(port).start();
	}
}
