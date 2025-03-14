package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGSkip {
	
	@Test  // Skip Test
	public void SkipTest() {
		//logic - few lines
		throw new SkipException("Skipping The Test Method ");
	}

}
