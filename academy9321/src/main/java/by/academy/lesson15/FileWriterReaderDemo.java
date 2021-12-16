package by.academy.lesson15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo {
	public static void main(String[] args) throws IOException {
		int size = 0;
		File file = new File("src\\io\\fileWrite.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		try {
			FileWriter fw = new FileWriter(file);

			fw.write("Learn\nJava!\n");
			fw.close();
			FileReader fr = new FileReader(file);

			int i;
			while ((i = fr.read()) != -1) {
				System.out.println((char) i);
				size++;
			}
			System.out.println("Количество прочитанных символов: " + size + " ");
			fr.close();
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}