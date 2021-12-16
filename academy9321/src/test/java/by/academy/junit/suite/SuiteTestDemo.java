package by.academy.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import by.academy.junit.fixtures.CalculatorTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CalculatorTest.class, SecondClassTest.class })
public class SuiteTestDemo {

}
