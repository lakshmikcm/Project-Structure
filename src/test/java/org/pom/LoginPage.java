package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
//public void login() {
//	
//	//Without page factory
//	WebElement username = driver.findElement(By.id("email"));
//
//	sendKeys(username, "Beulah");
//
//}
	
	//to connect driver using constructor automatically invoke the methods if we forget to connect the driver
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//WithPage factory
// using annotations

// by the concept of encapsulation locators are hiding
	@CacheLookup
	@FindBys({ 
	@FindBy(id="email"),@FindBy(xpath="//input[@type='text']")})
	private WebElement username;
	
	@CacheLookup
	@FindAll({ 
	@FindBy(id="pass"),@FindBy(xpath="//input[@type='passw']")})
	private WebElement pass;
	
	@CacheLookup
 @FindBy(name="login")
private WebElement login;
	


	
	
//now we are using getter to get the values

public WebElement getUsername() {
return username;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLogin() {
	return login;
}




	
	}


