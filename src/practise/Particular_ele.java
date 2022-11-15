package practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular_ele {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=sorry&ei=Tb5HY8qiFp3gz7sPsNSuqAo&ved=0ahUKEwiK_Z-819z6AhUd8HMBHTCqC6UQ4dUDCA4&uact=5&oq=sorry&gs_lcp=Cgdnd3Mtd2l6EAMyCggAEEcQ1gQQsAMyCggAEEcQ1gQQsAMyCggAEEcQ1gQQsAMyCggAEEcQ1gQQsAMyCggAEEcQ1gQQsAMyCggAEEcQ1gQQsAMyCggAEEcQ1gQQsAMyCggAEEcQ1gQQsAMyBwgAELADEEMyBwgAELADEEMyBwgAELADEEMyBwgAELADEEMyDQgAEOQCENYEELADGAEyDQgAEOQCENYEELADGAEyDQgAEOQCENYEELADGAEyDwguENQCEMgDELADEEMYAjIPCC4Q1AIQyAMQsAMQQxgCMg8ILhDUAhDIAxCwAxBDGAIyDAguEMgDELADEEMYAkoECE0YAUoECEEYAEoECEYYAVAAWABgpRxoA3AAeACAAQCIAQCSAQCYAQDIARPAAQHaAQYIARABGAnaAQYIAhABGAg&sclient=gws-wiz#imgrc=Fj72a4qjFDp_z");
		//find particular element and store it into ref variable
		WebElement particular=driver.findElement(By.xpath("//img[@id='dimg_5']"));
		File src= particular.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\user\\Desktop\\Screenshot save//GOOGL.png");
		Files.copy(src, dest);
				
	}

}
