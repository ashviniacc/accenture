package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A1 {
	@Test
	public void tc1() {
		Reporter.log("test case 1pass",true);
	}
@Test
public void tc2() {
	Reporter.log("test case 2 pass",true);
}
@Test
public void tc3() {
	Reporter.log("test case 3 pass",true);
}
}


