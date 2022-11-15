package Hndle_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_dynamic_ele {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		//print death cases
		String deat=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
		System.out.println(deat);
		//print recovery cases
		String rec=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
		System.out.println(rec);
		//print coronavirous caSES
		String coro=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
		System.out.println(coro);
		
	}

}
