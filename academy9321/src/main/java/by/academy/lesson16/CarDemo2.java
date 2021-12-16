package by.academy.lesson16;

import java.io.IOException;

public class CarDemo2 {
	public String a = "1";

	public static void main(String[] args) throws IOException {
		Car[] cars = { new Car(CarTypes.COMPACT, 34000), new Car(CarTypes.SPORT, 44000),
				new Car(CarTypes.COMPACT, 14000), new Car(CarTypes.COMPACT, 10000), };

		CarDemo2 carDemo = new CarDemo2();

		Searchable compact = new CompactCarSearch();

		Searchable expensive = new ExpensiveCarSearch();

		System.out.println(carDemo.getCarsNumber(cars, compact));
		System.out.println(carDemo.getCarsNumber(cars, expensive));

		System.out.println(carDemo.getCarsNumber(cars, new Searchable() {
			@Override
			public boolean test(Car car) {
				return car.getType().equals(CarTypes.SPORT);
			}
		}));
		carDemo.getCarsNumber(cars, (Car car) -> {
			return car.getType().equals(CarTypes.SPORT);
		});

	}
	private int getCompactCarsNumber(Car[] cars) {
	     int result = 0;
	     for (Car car : cars) {
	         if (car.getType().equals(CarTypes.COMPACT)) {
	             result++;
	         }
	     }
	     return result;
	 }
	
	private int getExpensiveCarsNumber(Car[] cars) {
	    int result = 0;
	    for (Car car : cars) {
	        if (car.getCost() > 20000) {
	            result++;
	        }
	    }
	    return result;
	}
	private int getCarsNumber(Car[] cars, Searchable compactCarSearch) throws IOException {
		int result = 0;

		for (Car car : cars) {
			if (compactCarSearch.test(car)) {
				result++;
			}
		}
		return result;
	}
}
