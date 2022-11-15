package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailablereport {
	@Test
		public void tc1() {
			Reporter.log("hi",true);
		}
	
@Test
public void tc2() {
	Reporter.log("hello",true);
}
}


