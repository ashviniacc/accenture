package pomwith_pagefactory_withoutddf;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Pomwithpagefactory_usingtestng.Loginpage;

public class Loginpage {
	//declaration
	@FindBy(xpath ="")private WebElement UN;
	@FindBy(xpath ="")private WebElement PWD;
	@FindBy(xpath="")private WebElement LoginBTN;

    //initalization
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterUN() {
		UN.sendKeys("admin");
	}
	public void enterPWD() {
		PWD.sendKeys("manager");
	}
	public void clickLoginBtn() {
		LoginBTN.click();
			
			
		
		
		
	}
}
