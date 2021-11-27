package by.academy.lesson9.classwork;

import by.academy.lesson5.packages.sub2.Car;
import by.academy.lesson7.oop.classwork.Animal;

public class ApplicationNoGenericBox {

	public static void main(String[] args) {

		Box<Animal> b1 = new Box<>(new Cat());
		System.out.println(b1);

		NoGenericBox<Car> b2 = new NoGenericBox<>();
		System.out.println(b2);
	}

}
