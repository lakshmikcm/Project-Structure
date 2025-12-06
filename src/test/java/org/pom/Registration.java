package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Registration extends LoginPage{
	@CacheLookup
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement createAccount;
	
	@CacheLookup
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstname;
	
	@CacheLookup
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@CacheLookup
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobnum;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='password']")
	private WebElement newpass;
	
	@CacheLookup
	@FindBy(id="day")
	private WebElement Day;
	
	
	@CacheLookup
	@FindBy(id="month")
	private WebElement month;
	
	@CacheLookup
	@FindBy(id="year")
	private WebElement year;
	
	
	@CacheLookup
	@FindBy(id="sex")
	private WebElement gender;
	
	@CacheLookup
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	public WebElement getGender() {
		return gender;
	}



	public WebElement getDay() {
		return Day;
	}



	public WebElement getMonth() {
		return month;
	}



	public WebElement getYear() {
		return year;
	}



	

	public WebElement getSubmit() {
		return submit;
	}



	public WebElement getCreateAccount() {
		return createAccount;
	}



	public WebElement getFirstname() {
		return firstname;
	}



	public WebElement getLastname() {
		return lastname;
	}



	public WebElement getMobnum() {
		return mobnum;
	}



	public WebElement getNewpass() {
		return newpass;
	}
	
	
}
