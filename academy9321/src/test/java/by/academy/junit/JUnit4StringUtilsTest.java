package by.academy.junit;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.google.gwt.util.tools.shared.StringUtils;

public class JUnit4StringUtilsTest extends Assert {

	private Map<String, byte[]> toHexStringData = null;

	@Before
	public void setUpToHexStringData() {
		toHexStringData = new HashMap<String, byte[]>();
		toHexStringData.put("", new byte[0]);
		toHexStringData.put("01020d112d7f", new byte[] { 1, 2, 13, 17, 45, 127 });
		toHexStringData.put("00fff21180", new byte[] { 0, -1, -14, 17, -128 });
	}

	@After
	public void tearDownToHexStringData() {
		toHexStringData.clear();
	}

	@Test
	@Ignore
	public void testToHexString() {
		
		for (Map.Entry<String, byte[]> entry : toHexStringData.entrySet()) {
			final byte[] testData = entry.getValue();
			final String expected = entry.getKey();
			final String actual = StringUtils.toHexString(testData);
			assertEquals(expected, actual);
		}
	}

	@Test(expected = NullPointerException.class)
	public void testToHexStringWrong() {
		StringUtils.toHexString(null);
	}

	@Test(timeout = 1000)
	public void infinity() {
//		while (true)
//			;
	}
}