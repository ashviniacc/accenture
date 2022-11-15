package Hndle_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class decendant {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/WebTable%20by%20ANKUSH%20(1).html");
		
		//to print student name header
	String stud=driver.findElement(By.xpath("//table[@id=\"2244\"]//th[2]")).getText();
	System.out.println(stud);
	
	//to print city
	String city=driver.findElement(By.xpath("//table[@id=\"2244\"]//th[3]")).getText();
	System.out.println(city);
	
	//print sr no
	String srnop=driver.findElement(By.xpath("//table[@id=\"2244\"]//th[1]")).getText();
	System.out.println(srnop);
	
	//print sachin using descendant(dirct jump to element)
	String sa=driver.findElement(By.xpath("//table[@id=\"2244\"]/descendant::td[2]")).getText();
    System.out.println(sa);
    
    //print nagpur
	String pa=driver.findElement(By.xpath("//table[@id=\"2244\"]/descendant::td[6]")).getText();
    System.out.println(pa);
    //print row1
  String rw1=driver.findElement(By.xpath("//table[@id=\"2244\"]/descendant::tr[1]")).getText();
	System.out.println(rw1);
	//print row4	String
	 String rw4=driver.findElement(By.xpath("//table[@id=\"2244\"]/descendant::tr[4]")).getText();
		System.out.println(rw4);
	

    

    
	}

}
