package web_driver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
public static void main(String[] args) {
	//by css selector
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//enter pw
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	//enter id
	driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
	//login button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();


}
}