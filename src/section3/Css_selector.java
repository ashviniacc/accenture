package section3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\user\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//application open
		driver.get("https://demo.actitime.com/login.do");
		// entr username
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		//entr pwd
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		// login
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	}


