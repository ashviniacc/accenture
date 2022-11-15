package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Flipcart_screenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window();
		TakesScreenshot TS=(TakesScreenshot)driver;
		File src =TS.getScreenshotAs(OutputType.FILE);
		File dset=new File("C:\\Users\\user\\Desktop\\Screenshot save//img.png");
		Files.copy(src, dset);
		
	}

}
