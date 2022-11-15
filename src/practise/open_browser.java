package practise;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_browser {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\user\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.navigate().back();
		Dimension d= new Dimension();
		driver.manage().window();
		
	}

}