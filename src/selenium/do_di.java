package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class do_di {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		//entr password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		// login
    	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}