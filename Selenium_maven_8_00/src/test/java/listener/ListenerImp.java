package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImp implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("test script is failed",true);
	}
	
}
