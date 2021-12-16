package by.academy.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FuncMathTest extends Assert {

	private FuncMath math;

	@Before
	public void init() {
		math = new FuncMath();
		System.out.println("init");
	}

	@After
	public void tearDown() {
		math = null;
		System.out.println("tearDown");
	}

	@Test
	public void calls() {
		assertEquals("math.getCalls() != 0", 0, math.getCalls());

		math.factorial(1);
		assertEquals(1, math.getCalls());

		math.factorial(1);
		assertEquals(2, math.getCalls());
	}

	@Test
	public void factorial() {
		assertTrue(math.factorial(0) == 1);
		assertTrue(math.factorial(1) == 1);
		assertTrue(math.factorial(5) == 120);
	}

	@Test(expected = IllegalArgumentException.class)
	public void factorialNegative() {
		math.factorial(-1);
	}

	@Test(timeout = 1000)
	public void whileTest() {
		while (true)
			;
	}

	@Test
	public void factorialTen() {
		assertEquals(2, math.factorial(2));
	}

	@Ignore
	@Test(timeout = 1000 * 60 * 60 * 24)
	public void todo() {
		assertTrue(math.plus(1, 1) == 3);
	}
}