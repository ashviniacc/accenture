package Actitime_withDDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args)throws Throwable {
	//excel fetching
	FileInputStream fis=new FileInputStream("C:\\Users\\user\\Downloads\\ashvini123.xlsx");
	org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	//set properties
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	//enter username
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
	//enter pwd
	//Enter PWD
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PWD);
		//click
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//verify the text
		String expText=sh.getRow(0).getCell(2).getStringCellValue();
		String actText=driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		if(actText.equals(expText)) {
			System.out.println("TC pass");
		}
		else{
			System.out.println("fail");
		}
	}
		

	


}