package by.academy.junit;

public class Calculator {

	public static int getSum(int x, int y) {
		return x + y;
	}

	public static int getDivide(int x, int y) {
		return x / y;
	}

	public static int getMultiple(int x, int y) {
		return x * y;
	}
// 1. Тест проверяет метод деления с помощью assertEquals
// 2. Тест проверяет метод сложения с помощью assertNotEquals
// 3. Тест проверяет метод деления, expected = ArithmeticException.class деление на ноль
// 4. Тест проверяет метод сложения в бесконечном цикле, тест пометить параметром timeout = 100

// NOTE: создать класс, CalculatorTest, наследоваться от Assert
	public static void main(String... args) {
		boolean b = true;
		while (b) {
			System.out.println("Hello there!");
		}
	}
}
