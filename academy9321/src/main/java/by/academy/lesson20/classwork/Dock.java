package by.academy.lesson20.classwork;

public class Dock {
	private static final int FULL_CAPACITY = 10;
	private int capacity;
	private String name;

	public Dock(int numberContainers, String name) {
		super();
		this.capacity = FULL_CAPACITY - numberContainers;
		this.name = name;
	}

	// load by one, return true if success
	public boolean load() {
		if (capacity == 0) {
			System.out.println("Невозможно загрузить на товар на склад. Склад " + name
					+ " полный. Текущая загруженость: " + capacity);
			return false;
		} else {
			System.out.println("Товар успешно загружен на склад " + name + ". Текущая загруженость: " + capacity);
			capacity--;
			return true;
		}
	}

	// unload by one, return true if success
	public boolean unload() {
		if (capacity == FULL_CAPACITY) {
			System.out.println("Невозможно загрузить на товар на склад. Склад " + name
					+ " пустой. Текущая загруженость: " + capacity);
			return false;
		} else {
			System.out.println("Товар успешно взят со склада " + name + ". Текущая загруженость: " + capacity);
			capacity++;
			return true;
		}
	}
}
