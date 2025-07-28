package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer// interface by testng

{
	
	int counter=0;
	int retryLimit=2;
public boolean retry(ITestResult result) //invoke when testcase fails
{
	if(counter<retryLimit)
	{
		counter++;
		return true; //reexecution
	}
	return false; //stop execution
	
}

/*public boolean retry(ITestResult result) {
	// TODO Auto-generated method stub
	return false;
}*/

}
//retry used for automatically rexecute failed testcases to a certain limit,used in flaky testcases