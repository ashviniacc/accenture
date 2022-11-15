package Listbox_customized;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selenium.key_class;

public class select_options {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//click on creat new account
    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
   //select month
     WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
     Actions act= new Actions(driver);
     act.click(month).perform();
   
    
}

}
