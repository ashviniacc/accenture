package web_driver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up_alert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
}

}
