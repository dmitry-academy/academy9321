package by.academy.lesson7.oop.classwork.deal;

public class Car extends Product {

	public Car() {
		super();
		this.type = "Car";
	}

	public Car(String name, double cost) {
		super(name, "Car", cost);
	}

}
