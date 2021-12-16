package by.academy.junit.listeners;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class TestClassA extends Assert {

	@Rule
	public final TestRule globalRule = Timeout.millis(20);
	
	@Test
	public void test_A_1() {
		Assert.assertTrue(1 == 2);
	}

	@Test
	public void testEquals() {
		Assert.assertTrue(1 == 2);
	}

	@Test
	public void test_A_2() {
		assertTrue(true);
	}
}