package practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class a {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		// find element which we need to handle
		WebElement img=driver.findElement(By.xpath("//img[@class='s4Iyt']"));
		File src= img.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\user\\Desktop\\Screenshot save//img.png");
		Files.copy(src, dest);
	}

}
