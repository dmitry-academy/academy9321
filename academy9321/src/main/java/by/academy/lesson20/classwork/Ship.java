package by.academy.lesson20.classwork;

public class Ship implements Runnable {

	private static final int FULL_CAPACITY = 5;
	private Port port;
	private int numberContainers;
	private boolean isUnloading;

	public Ship(Port port, int numberContainers, boolean isLoading) {
		super();
		this.port = port;
		this.numberContainers = numberContainers;
		this.isUnloading = isLoading;
	}

	@Override
	public void run() {
		if (isUnloading) {
			unload();
		} else {
			load();
		}
	}

	private void load() {
		while (numberContainers < FULL_CAPACITY) {
			Dock dock = port.takeDock();
			innerLoop: for (int i = 0; i < FULL_CAPACITY; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (dock.unload() && numberContainers + 1 <= FULL_CAPACITY) {
					numberContainers++;
					System.out.println("Товар успешно разгружен со склада. Осталось разгрузить: " + numberContainers);
				} else {
					break innerLoop;
				}
			}
			port.leaveDock(dock);
		}
	}

	private void unload() {
		while (numberContainers > 0) {
			Dock dock = port.takeDock();
			innerLoop: for (int i = 0; i < numberContainers; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (dock.load()) {
					numberContainers--;
					System.out.println("Товар успешно загружен на склад. Осталось загрузить: " + numberContainers);
				} else {
					break innerLoop;
				}
			}
			port.leaveDock(dock);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ship [numberContainers=");
		builder.append(numberContainers);
		builder.append(", isUnloading=");
		builder.append(isUnloading);
		builder.append("]");
		return builder.toString();
	}

}
