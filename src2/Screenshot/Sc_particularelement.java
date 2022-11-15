package Screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Sc_particularelement {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://www.google.com/");
		
		//find particular element and store ref variable
		WebElement particular=driver.findElement(By.xpath("//img[@class='inXdpd']"));
		File src=particular.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\user\\Desktop\\Screenshot save\\logo.jpg");
		Files.copy(src, dest);
	}

}