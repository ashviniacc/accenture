package test_ng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
@BeforeClass
public void openbrowser() {
	Reporter.log("open the browser,true");
}

@BeforeMethod
public void loginapp() {
	Reporter.log("login to app",true);
}

@AfterClass
public void verifyid() {
Reporter.log("verify user id",true);	
}
@Test
public void openapp() {
	Reporter.log("open app",true);
	
}
@AfterMethod
public void logoutapp() {
	Reporter.log("logout from app",true);
}
@AfterClass
public void closebrowser() {
	Reporter.log("close the browser",true);
}
}