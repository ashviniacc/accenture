package practise;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scrren_P {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		//typecast driver
		TakesScreenshot ts=(TakesScreenshot)driver;
		//call method get screen shot it will accept argument as[]
		File src=ts.getScreenshotAs(OutputType.FILE);
		//folder path is given to constructor class
		File dest=new File(");)");
		//finally call the class which copy file src from source to destanation
		Files.copy(src, dest);
		//

		
	}
}
