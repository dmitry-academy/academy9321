package by.academy.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleMathTest2 extends Assert {
	// 1. Тест проверяет метод деления с помощью assertEquals
	// 2. Тест проверяет метод сложения с помощью assertNotEquals
	// 3. Тест проверяет метод деления, expected = ArithmeticException.class деление
	// на ноль
	// 4. Тест проверяет метод сложения в бесконечном цикле, тест пометить
	// параметром timeout = 100
	// 5. Тест, который должен закончиться неудачей.
	// 6. Добавим тест, который должен проигнорироваться системой
	// NOTE: создать класс, CalculatorTest, наследоваться от Assert

	@BeforeClass
	public static void init() {
		System.out.println("Hello There! @BeforeClass");
	}

	@AfterClass
	public static void postInit() {
		System.out.println("Hello There! @AfterClass");
	}

	@Before
	public void before() {
		System.out.println("Hello There! @Before");
	}

	@After
	public void after() {
		System.out.println("Hello There! @After");
	}

	@Test(timeout = 100, expected = ArithmeticException.class)
	public void test2() {
		System.out.println("@Test(timeout = 100, expected = ArithmeticException.class)");
		Calculator.getDivide(2, 0);
	}

	@Test
	public void testMathSum1() {
		System.out.println("testMathSum");
		assertEquals(4, Calculator.getSum(2, 2));
	}
	@Test
	public void testMathSum2() {
		System.out.println("testMathSum");
		assertEquals(6, Calculator.getSum(3, 3));
	}
	@Test
	public void testMathSum3() {
		System.out.println("testMathSum");
		assertEquals(8, Calculator.getSum(4, 2));
	}

	@Test
	@Ignore
	public void testFail() {
		System.out.println("testFail");
		fail();
	}

	@Test(timeout = 1000)
	public void test1() {
		System.out.println("test1");
//		boolean b = true;
//		while (b) {
//		}
	}

}
