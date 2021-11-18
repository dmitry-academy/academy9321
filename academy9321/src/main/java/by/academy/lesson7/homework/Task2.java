package by.academy.lesson7.homework;

import java.util.Scanner;

//Задание 2. 

//Ввести n слов с консоли. Найти слово, 
//в котором число различных символов минимально. 
//Если таких слов несколько, найти первое из них.

public class Task2 {

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество слов: ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Введите слово: ");
			arr[i] = sc.next();
		}
		System.out.println("test");
		int minChars = -1;
		String minWord = null;

		for (int i = 0; i < n; i++) {
			String s = arr[i];
			int unique = getUniqueCharQuantity(s);
			System.out.println("Слово: " + s + " Уникальных значений: " + unique);
			if (minWord == null || minChars > unique) {
				minChars = unique;
				minWord = s;
			}
		}
		System.out.println(minWord);
		sc.close();
	}

	private static int getUniqueCharQuantity(String s) {
		System.out.println("Считаем количество уникальных символов");
		int[] charCounter = new int[256];
		char[] allChars = s.toCharArray();

		for (int i = 0; i < allChars.length; i++) {
			char c = allChars[i];
			charCounter[c]++;
		}
		int uniqueCounter = 0;
		for (int i = 0; i < charCounter.length; i++) {
			int counter = charCounter[i];
			if (counter > 0) {
				uniqueCounter++;
			}
		}
		return uniqueCounter;
	}

}
