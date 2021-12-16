package by.academy.lesson11.classwork;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Вася", 7);
		map.put("Петя", 4);
		map.put("Маша", 3);
		map.put("Наташа", 8);

		System.out.println(map.get("Вася"));

		for (String key : map.keySet()) {
//			System.out.println(key + ": " + map.get(key));
			System.out.println(key.hashCode());
		}

		for (Integer value : map.values()) {
			System.out.println(value);
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
