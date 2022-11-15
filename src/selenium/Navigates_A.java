package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigates_A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.driver", "C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver() ;
	        
		  
          driver.get("https://www.whatsappimages.in/shinchan-whatsapp-dp-images/");
          driver.manage() .window() .maximize() ;// to maximize
           Thread.sleep(3000);
          driver .manage().window().minimize();// to minimize
            
          
          Dimension d = new Dimension(100, 200);
          
          driver.manage().window().setSize(d); // set size 

	
	}
}