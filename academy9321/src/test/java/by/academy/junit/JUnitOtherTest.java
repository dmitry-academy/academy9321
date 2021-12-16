package by.academy.junit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;

import com.google.gwt.util.tools.shared.StringUtils;

public class JUnitOtherTest {
//check
	@Rule
	public final TemporaryFolder folder = TemporaryFolder.builder().assureDeletion().build();

	@Rule
	public final Timeout timeout = new Timeout(1000, TimeUnit.MILLISECONDS);

	@Rule
	public final ExpectedException thrown = ExpectedException.none();

	@Ignore
	@Test
	public void anotherInfinity() {
		while (true)
			;
	}

	@Test(timeout = 2000)
	@Ignore
	public void test() throws IOException {
		for (;;) {
		}
	}

	@Test
	public void testFileWriting() throws IOException {
		final File log = folder.newFile("debug.log");
		final FileWriter logWriter = new FileWriter(log);
		logWriter.append("Hello, ");
		logWriter.append("World!!!");
		logWriter.flush();
		logWriter.close();
	}

	@Test
	public void testExpectedException() throws IOException {
		thrown.expect(NullPointerException.class);
		StringUtils.toHexString(null);
	}
}