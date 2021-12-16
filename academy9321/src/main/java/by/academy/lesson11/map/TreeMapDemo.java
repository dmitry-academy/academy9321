package by.academy.lesson11.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		SortedMap<String, Double> treeMap = new TreeMap<>();

		treeMap.put("БИванов", 3434.34);
		treeMap.put("АПетров", 123.22);
		treeMap.put("ВСидоров", 1378.00);

		treeMap.forEach((k, v) -> System.out.println(k + ": " + v));
	}
}