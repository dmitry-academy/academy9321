package by.academy.junit.listeners;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class OurListener extends RunListener {

	// Called before any tests have been run.
	@Override
	public void testRunStarted(Description description) throws java.lang.Exception {
		System.out.println("Test cases to execute : " + description.getDisplayName());
	}

	// Called when all tests have finished
	@Override
	public void testRunFinished(Result result) throws java.lang.Exception {
		System.out.println("Test cases executed : " + result.getRunCount());
	}

	// Called when an atomic test is about to be started.
	@Override
	public void testStarted(Description description) throws java.lang.Exception {
		System.out.println("Execution Started : " + description.getMethodName());
	}

	// Called when an atomic test has finished, whether the test succeeds or
	// fails.
	@Override
	public void testFinished(Description description) throws java.lang.Exception {
		System.out.println("Execution Finished : " + description.getMethodName());
	}

	// Called when an atomic test fails.
	@Override
	public void testFailure(Failure failure) throws java.lang.Exception {
		System.out.println("Execution Failure : " + failure.getException());
	}

	// Called when a test will not be run, generally because a test method is
	// annotated with Ignore.
	@Override
	public void testIgnored(Description description) throws java.lang.Exception {
		System.out.println("Execution Ignored : " + description.getMethodName());
	}

	// Called when an atomic test flags that it assumes a condition that is false
	@Override
	public void testAssumptionFailure(Failure failure) {
		System.out.println("Assumption Failure : " + failure.getMessage());
	}
}