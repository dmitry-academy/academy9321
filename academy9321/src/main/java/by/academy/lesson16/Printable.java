package by.academy.lesson16;

@FunctionalInterface
public interface Printable {

	void print(String p);

	boolean equals(Object o);

	int hashCode();

	String toString();
}
