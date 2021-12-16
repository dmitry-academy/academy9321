package by.academy.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleMathTest extends Assert {

	@Test
	@Ignore
	public void testFail() {
		System.out.println("@testFail");
		fail();
	}

	@Test
	public void testMathSum() {
		System.out.println("@testMathPlus");
		assertEquals(4, Calculator.getSum(2, 2));
	}

	@Test(timeout = 1)
	public void testTimeout() {
		int i = 0;
		while (i < 100) {
			System.out.println("alalal");
			i++;
		}
	}

	@Test(expected = ArithmeticException.class)
	public void testMathDivide() {
		System.out.println("@testMathDivide");
		int a = 1 / 0;
	}

	@Test
	@Ignore
	public void testAssertFalse() {
		System.out.println("@testAssertFalse");
		assertTrue(false);
	}

	@Test
	public void testAssertTrue() {
		System.out.println("@testAssertTrue");
		assertTrue(true);
	}

	@Before
	public void before() {
		System.out.println("Before");
	}

	@After
	public void after() {
		System.out.println("After");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass");
	}
}
