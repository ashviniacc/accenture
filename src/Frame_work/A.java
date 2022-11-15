package Frame_work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.tools.javac.jvm.Target;

public class A {

public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//handle hideen division popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//search product
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("iphone 11 maxpro",Keys.ENTER);
	//	print price of that phone
	//	 String prc=driver.findElement(By.xpath("div[@class=\\\"_30jeq3 _1_WHN1\\\"][1]")).getText();
	//	 System.out.println(prc);
	//add to cart
		Actions act= new Actions(driver);
		act.moveToElement(target).doubleClick().perform();
		driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		
		
}

}
