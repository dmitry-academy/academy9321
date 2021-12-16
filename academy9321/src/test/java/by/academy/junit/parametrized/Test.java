package by.academy.junit.parametrized;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import by.academy.junit.listeners.TestRunner;

@RunWith(TestRunner.class)
public class Test {

	public static class SubTestWithRunner extends ParameterizeTest {

		public SubTestWithRunner(int valueA, int valueB, int expected) {
			super(valueA, valueB, expected);
		}

		@BeforeClass
		public static void init() {
			System.out.println("SubTestWithRunner init()");
		}
	}
}
