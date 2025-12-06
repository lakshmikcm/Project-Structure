package org.git.test;

import org.baseclass.BaseClass;
import org.pom.LoginPage;
import org.pom.Registration;

public class Sample extends Registration{
	
	public static void main(String[] args) {
		
		browserLaunch("chrome");
		implicitWait(20);
		urlLaunch("https://www.facebook.com/");
		
		// create object for loginpage
		LoginPage l=new LoginPage();
		//l.login();
		
		sendKeys(l.getUsername(),"Beulah");
		sendKeys(l.getPass(),"12364");
		//click(l.getLogin());
		
		Registration r=new Registration();
		
		click(r.getCreateAccount());
		sendKeys(r.getFirstname(),"KAVYA");
		sendKeys(r.getLastname(),"Kalai");
		selectByIndex(r.getDay(),6);
		selectByVisibleText(r.getMonth(),"Nov");
		selectByVisibleText(r.getYear(),"1986");
		click(r.getGender());
		sendKeys(r.getMobnum(),"89087");
		sendKeys(r.getNewpass(),"345678");
		click(r.getSubmit());
		
	
	}

}
