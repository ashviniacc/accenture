package selenium;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Do_do {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//set size
		Dimension d= new Dimension(100,200);
		driver.manage().window().setSize(d);
		//set position
		Point p=new Point(300,400);
		driver.manage().window().setPosition(p);
		
	}
	

}


