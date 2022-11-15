package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Month {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//open the application
	driver.get("https://www.facebook.com/");
	//click on creat new account
	
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	//select dropdown which we need to handle
	
	//store list box in refrence variable 
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	
	//creat object of select class
	Select s=new Select(month);
	
	//select by text
	s.selectByVisibleText("MAY");
	
	//select by value
	s.selectByValue("8");
	//select by index
	s.selectByIndex(0);
}

}
