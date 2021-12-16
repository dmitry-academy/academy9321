package by.academy.lesson16.demo;

@FunctionalInterface
public interface Searchable {

	boolean test(Car car);

	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	@Override
	String toString();

}