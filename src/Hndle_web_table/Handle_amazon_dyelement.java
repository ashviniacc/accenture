package Hndle_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_amazon_dyelement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	//search mobile under 1000
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile under 1000",Keys.ENTER);
    //print price of 1st mobile
	String prc=driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-base'][1]")).getText();
	System.out.println(prc);
	
}
}