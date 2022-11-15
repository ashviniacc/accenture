package Action_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Decendant {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//handle popup
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//search for mobile
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 10000",Keys.ENTER);

}
}