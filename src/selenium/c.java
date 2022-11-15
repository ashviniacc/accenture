package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c {
public static void main(String[] args) {
	System.setProperty("webdriver.driver", "C:\\\\\\\\Users\\\\\\\\user\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.flipkart.com/");
	
}
}
