package Hndle_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nykaa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.findElement(By.xpath("//input[@class='css-1upamjb']")).sendKeys("facemask",Keys.ENTER);
String maskp=driver.findElement(By.xpath("//span[class='css-111z9ua']")).getText();
System.out.println(maskp);
	}
}
