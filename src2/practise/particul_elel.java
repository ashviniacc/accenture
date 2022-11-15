package practise;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class particul_elel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//find particular element
	WebElement particular=driver.findElement(By.xpath("//img[@class='s4Iyt']"));
	
	File dest=new File("C:\\Users\\user\\Desktop\\Screenshot save");
	File src=particular.getScreenshotAs(OutputType.FILE);
    Files.copy(src, dest);
	

}
}