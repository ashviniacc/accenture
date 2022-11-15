package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwihlqit1ZH6AhVLDysKHQuCDgMYABAAGgJzZg&ohost=www.google.com&cid=CAASJuRoAF1FEbNG4dgfJCi6cDiuCoAzMKcky6W5GwJIL4Gthtlcu-K0&sig=AOD64_0xV_k9Yt0lUbpZPfolmaOW90UY9g&q&adurl&ved=2ahUKEwj13aKt1ZH6AhX28TgGHTthCMYQ0Qx6BAgEEAE");
		Thread.sleep(3000);
		 //get method
	  driver.get("www.amazon.in/");
	  Thread.sleep(3000);
	  //navigate
    	driver.navigate().forward();//
    	Thread.sleep(3000);
    	
    	driver.navigate().back();
    	driver.navigate().refresh();
			
			
	}

}
