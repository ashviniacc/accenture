package test_ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asssert {
	@Test
	public void tc1() {
		Reporter.log("hi",true);
	}


@Test
public void TC2() {
	Reporter.log("hello",true);
}

@Test
public void tc2() {
	Reporter.log("hielo",true);
	Assert.fail();//fail test case intentionaly
}
}