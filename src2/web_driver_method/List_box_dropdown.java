package web_driver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_box_dropdown{
public static void main(String[]args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(4000);
    //click on creat new account 
    driver.findElement(By.xpath("//a [@id='u_0_0_nC']")).click();
}
}
