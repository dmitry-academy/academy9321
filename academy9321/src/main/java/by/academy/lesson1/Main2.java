package by.academy.lesson1;

public class Main2 {

	public static void main(String[] args) {
		Man m1 = new Man();
		m1.age = 999;
		System.out.println(m1);
		m1.grow();
		m1.printName();
		System.out.println(m1);

		Man m2 = new Man("Петя");
		System.out.println(m2);

		Man m3 = new Man("Петя", 30);
		System.out.println(m3);

		Man m4 = new Man("Саша", 30, 500);
		System.out.println(m4);
		m4.pay(10, "Кофе");
		
		System.out.println(m4);

	}

}
