package by.academy.lesson12.exceptions.trycatch;

import java.io.IOException;
import java.util.Scanner;

public class FinallyUse {
	// Выход из метода через исключение
	public static void procA() throws IOException {
//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("Внутри procA");
//			throw new RuntimeException("demo");
//		}

		try (NotAutoclosable a = new NotAutoclosable()) {
			System.out.println("Внутри procA");
			throw new RuntimeException("demo");
		}
	}

	// Возврат изнутри try-блока
	public static void procB() {

		try {
			System.out.println("Внутри procB");
			return;
		} finally {
			System.out.println("finally для procB ");
		}
	}

	// Нормальное выполнение try-блока
	public static void procC() {
		Scanner sc = new Scanner(System.in);
		try {
			// some exception
			System.out.println("Внутри procC");
		} catch (Exception e) {
			System.out.println("Catch block");
		} finally {
			sc.close();
			System.out.println("finally procC");
		}
	}

	public static void main(String[] args) {
//		try {
//			procA();
//		} catch (Exception e) {
//			System.out.println("Исключение выброшено");
//		}
		procB();
		System.out.println("main block");
//		procC();
//		System.out.println("test");
	}
}