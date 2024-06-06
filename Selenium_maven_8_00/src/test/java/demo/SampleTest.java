package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void test() {
		Reporter.log("SampleTest class executed",true);
		Reporter.log("SampleTest class modified",true);
		Reporter.log("SampleTest class added",true);
	}
}
