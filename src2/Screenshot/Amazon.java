package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://www.amazon.in/");
		//how to take screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;// type cast operator
		
		// use  get screenshot method and stored in src
		File src=ts.getScreenshotAs(OutputType.FILE);
	
		// creat folder where we need to store screenshot and give the path of folder with proper name and extension
		
		File dest=new File("\"C:\\Users\\user\\Desktop\\Screenshot save\\amazon.jpg");
		
		//copy screenshot from src to destination
	     Files.copy(src, dest);
	}

}
