package by.academy.lesson16;

@FunctionalInterface
public interface Searchable {

	boolean test(Car car);

	boolean equals(Object o);

	int hashCode();

	String toString();
}
