package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_navigate {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//minimize the browser
		driver.manage().window().minimize();
		
	}

}
