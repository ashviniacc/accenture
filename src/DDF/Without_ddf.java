package DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.key_class;

public class Without_ddf {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.actitime.com/login.do");
		//enter password
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//enter password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//click on login button
		//driver.findElement(By.xpath("//div[text()='Login']"));
	}

}
