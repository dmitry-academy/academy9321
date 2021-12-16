package by.academy.lesson12.exceptions.trycatch;

import java.io.Closeable;
import java.io.IOException;

public class NotAutoclosable implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("close");
	}

}
