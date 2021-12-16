package by.academy.lesson16;

public class ExpensiveCarsSearch implements Searchable {

	@Override
	public boolean test(Car car) {
		return car.getCost() > 20000;
	}

}
