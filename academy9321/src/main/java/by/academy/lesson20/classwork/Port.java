package by.academy.lesson20.classwork;

import java.util.LinkedList;

public class Port {

	private LinkedList<Dock> docs;

	public Port(LinkedList<Dock> docs) {
		super();
		this.docs = docs;
	}

	public synchronized Dock takeDock() {

		Dock dock = docs.poll();

		while (dock == null) {
			try {
				wait();
				System.out.println("Ждем свободный причал");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			dock = docs.poll();
		}
		return dock;
	}

	public synchronized void leaveDock(Dock dock) {
		docs.add(dock);
		System.out.println("Причал освободился");
		notify();
	}
}
