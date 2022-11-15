package Testng_1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class prog_1 {
	@Test
	public void tc1() {
		Reporter.log("hi",true);//to generate emaiable report we write true
	}

}
