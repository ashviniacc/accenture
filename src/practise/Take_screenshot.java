package practise;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_screenshot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		// need to tyecast driver
		Take_screenshot TS=(Take_screenshot)driver;
		//use get screenshot method it will accept argument as (OUTPUTTYPE.FILE)
		File src=new File("");
			
		
	}

}
