package by.academy.test;

import java.util.Locale;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первую строку");
		String str = scan.nextLine().trim().toLowerCase(Locale.ROOT);
		System.out.println("Введите вторую строку");
		String str1 = scan.nextLine().trim().toLowerCase(Locale.ROOT);
		int count = 0;

		char s[] = str.toCharArray();
		char s1[] = str1.toCharArray();

		for (char c : s) {
			count ^= (int) c;
		}

		for (char c1 : s1) {
			count ^= (int) c1;
		}

		if (count == 0)
			System.out.println("Строки являются перестановкой символов");
		else
			System.out.println("Строки не являются перестановкой символов");

	}

}