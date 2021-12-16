package by.academy.junit.listeners;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class TestClassB extends Assert {

	@Test
	public void test_B_1() {
		assertTrue(true);
	}

	@Ignore
	@Test
	public void test_B_2() {
		assertTrue(2 == 5);
	}
}