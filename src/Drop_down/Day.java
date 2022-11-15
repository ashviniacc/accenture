package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		////open application
		driver.get("https://www.facebook.com/");
		//click on creat new account
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//select dropdown which we needed to handle
	  
		//store list box in ref variable
	   WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
	   
		//creat object of select class
		Select s=new Select(Day);
		
	//	Thread.sleep(2000);
		//use select class methods (select by text
		s.selectByVisibleText("24");
		
		//select by value
		s.selectByValue("31");
}
}