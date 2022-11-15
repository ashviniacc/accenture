package web_driver_method;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eight_method {
public static void main(String[]args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\user\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	//creat object of chrome driver
	//wait

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//handle popup which comes
	 driver.findElement(By.xpath(" //button[@class='_2KpZ6l _2doB4z']")).click();
	 //maximize window
	 driver.manage().window().maximize();
	 Thread.sleep(20000);
	 //minimize
	 driver.manage().window().minimize();
	 // set dimension
	 Dimension d=new Dimension();
	// driver.manage().window().setSize(100,200);
	 //set position
	 Point p=new Point();
	// driver.manage().window().setPosition(100,200);
	 //geturl
	 String url=driver.getCurrentUrl();
	 System.out.println(url);
	 //get pagesource
	 String page=driver.getPageSource();
	 System.out.println(page);
	
}
}
