package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page_source {
public static void main(String[] args) {System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	//pagesource
	String allelements=driver.getPageSource();
	System.out.println(allelements);
	String title=driver.getTitle();
	System.out.println(title);
}
}
