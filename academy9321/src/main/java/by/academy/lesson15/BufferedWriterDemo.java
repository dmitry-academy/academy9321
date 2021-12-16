package by.academy.lesson15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter("src\\io\\buffWriter.txt");
				BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
			String text = "Привет мир!";
			bufferedWriter.write(text);
			bufferedWriter.newLine();
			bufferedWriter.write(text);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}