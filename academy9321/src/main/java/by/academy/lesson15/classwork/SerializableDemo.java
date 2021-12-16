package by.academy.lesson15.classwork;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) {

		User user = new User("SuperAdmin", "qwerty");
		try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream("src\\io\\user.txt"));

				ObjectOutputStream osu = new ObjectOutputStream(bufferedOutputStream)) {
			osu.writeObject("test");
			osu.writeInt(1);
			osu.writeObject(user);
//			osu.writeObject(Integer.valueOf(123));

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		try (BufferedInputStream br = new BufferedInputStream(new FileInputStream("src\\io\\user.txt"));
				ObjectInputStream isu = new ObjectInputStream(br)) {
			Integer i = isu.readInt();
			String str = (String) isu.readObject();
			User user1 = (User) isu.readObject();
			System.out.println(str);
			System.out.println(i);
			System.out.println(user1);

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
