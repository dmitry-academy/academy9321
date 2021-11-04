package by.academy.lesson5.strings;

public class ModifyStringDemo {
	public static void main(String[] args) {
		System.out.println("Hello".concat(" World"));
		System.out.println("Hello".replace("ll", ""));

		System.out.println("Hello".toLowerCase());
		System.out.println("Hello".toUpperCase());
		System.out.println("    Hello World ");
		System.out.println("			Hello World ".trim());
		System.out.println("			Hello World ".stripLeading());
		System.out.println("    Hello World           ".stripTrailing());
		System.out.println("			Hello World ".strip());

	}
}