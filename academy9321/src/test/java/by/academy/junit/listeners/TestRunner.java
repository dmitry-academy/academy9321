package by.academy.junit.listeners;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class TestRunner extends BlockJUnit4ClassRunner {

	private OurListener ourListener;

	public TestRunner(Class<OurListener> clz) throws InitializationError {
		super(clz);
		ourListener = new OurListener();
	}

	@Override
	public void run(final RunNotifier notifier) {
		notifier.addListener(ourListener);
		super.run(notifier);
	}
}
