package by.academy.lesson17.classwork;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
//	1. Сгенерировать 1000 чисел в диапазоне от 0 до 1000 используя Stream API. 
//	2. Нужно пропустить первые 50 элементов.
//	3. Оставить только четные числа.
//	4. Отсортировать числа.
//	5. Оставить только уникальные значения.
//	6. Преобразовать с помощью map числа в строки в формате: "Число " + n
//	7. Органичить количество элементов 200.
//	8. Сгенерировать List (.collect(Collectors.toList()))
	public static void main(String[] args) {

		List<String> list = 
				Stream.generate(() -> new Random().nextInt(1000))
				.limit(1000)
				.skip(50)
				.filter(o -> o % 2 == 0 && o != 0)
				.sorted()
				.distinct()
				.map(o -> "Число " + o)
				.limit(200)
				.collect(Collectors.toList());

		System.out.println(list);
	}
}
