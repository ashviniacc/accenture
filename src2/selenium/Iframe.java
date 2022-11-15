package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\user\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		// maximize the browser
		driver.manage().window().maximize();
		// switch to first frame
		driver.switchTo().frame("packageListElement");
		//take any element on first frame and print it
		 String text1=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.cli'")).getText();
		 System.out.println(text1);
		
		
	}

}
