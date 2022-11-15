package selenium;

public clas
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


	public static void main(String[] args) {
		System.setproperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 
		 //enter usename(use formula xpath by attribute)
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		 
		 //enter password
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 
		 //click on login btn(use formula xpath by text())
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	}
	}
