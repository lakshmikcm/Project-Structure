package org.baseclass;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	//no main method.. have to write all the codings in this class as a methods.
	
	//browser launch
	public static WebDriver driver; // driver is local variable to give outside the method
	
	public static WebDriver browserLaunch(String browser)
	{
		switch(browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
			default:
				System.out.println("Invalid browser");
				
		}
		
		return driver;
		
	}
	
	public static WebDriver launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
				{
			driver=new ChromeDriver();
				}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid browser");
		}
		return driver;
		
		

	}
	public static WebDriver chromeLaunch() {  // it should be static to access the method without object creation and also public
	 driver=new ChromeDriver();
		return driver;
	}


	//url launch
	public static void urlLaunch(String url) {
		//driver.get("https://www.facebook.com/"); no need to give everytime so go for below
		driver.get(url);
		driver.manage().window().maximize();

	}
	
	//wait
public static void implicitWait(long sec) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}

//getCurrenturl()

public static String getCurrenturl() { // return type is string, so instead of void, use string
	
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
}

//getTitle()
public static String getTitle() {
	String title = driver.getTitle();
	return title;
}

//We cannot write for locators, but for write webelement methods

//sendkeys()
public static void sendKeys(WebElement e, String value){

	e.sendKeys(value);

}

//click()

public static void click(WebElement e) {
e.click();

}

//close()

public static void close() {
	driver.close();

}

//quit
public static void quit() {
	driver.quit();
}

//getAttribute

public static String getAttribute(WebElement e, String name) {
	String attribute = e.getAttribute(name);
	return attribute;
	
}

//getText

public static String getText(WebElement e) {
	String text = e.getText();
	return text;

}

//Actions class methods
// moveToElements()
public static void moveToElement(WebElement target) {
	Actions a=new Actions(driver);
	a.moveToElement(target).perform();

}
//dragAndDrop()

public static void dragAndDrop(WebElement src,WebElement dest) {
Actions a=new Actions(driver);
a.dragAndDrop(src, dest).perform();

}

//contextClick()
public static void contextClick(WebElement e) {
	Actions a=new Actions(driver);
	a.contextClick(e).perform();

}

//doubleclick()
public static void doubleClick(WebElement e) {
	Actions a=new Actions(driver);
	a.doubleClick(e).perform();

}

//click and hold
public static void clickAndHold(WebElement e) {
	Actions a=new Actions(driver);
	a.clickAndHold(e).perform();

}

//Select class for dropdown
//selectByIndex()

public static void selectByIndex(WebElement e, int index) {
	Select s=new Select(e);
	s.selectByIndex(index);

}

//deselectByIndex()
public static void deSelectByIndex(WebElement e, int index) {
	Select s=new Select(e);
	s.deselectByIndex(index);
}

//selectByText(()
public static void selectByText(WebElement e, String value) {
	Select s=new Select(e);
	s.selectByValue(value);
}

//deSelectByText()
public static void deSelectByText(WebElement e, String value)
{
	Select s=new Select(e);
	s.deselectByValue(value);
}

//selectByVisibletext

public static void selectByVisibleText(WebElement e, String text) {
Select s=new Select(e);
s.selectByVisibleText(text);

}

//deSelectByVisibletext
public static void deSelectByVisibleText(WebElement e, String text) {
Select s=new Select(e);
s.deselectByVisibleText(text);

}

//Alert methods
//accept
public static void acceptAlert() {
//Alert a=driver.switchTo().alert();
//a.accept();
	driver.switchTo().alert().accept();

}

//dismiss alert

public static void dismissAlert() {
	Alert a=driver.switchTo().alert();
	a.dismiss();

}
//promptAlert
public static String promptAlert(String text) {
	return driver.switchTo().alert().getText();
	

}

//Navigation methods
// navigateTo()
public static void navigateTo(String url) {
	driver.navigate().to(url);

}

//navigateBack
public static void navigateBack() {
	driver.navigate().back();
}

//navigat forward
public static void navigateForward() {
	driver.navigate().forward();
}
	
//navigateRefresh

public static void navigateRefresh() {
	driver.navigate().refresh();

}

//TakeScreenshot
public static void takeScreenshot() throws IOException {
TakesScreenshot tk=(TakesScreenshot)driver;
File src=tk.getScreenshotAs(OutputType.FILE);
long fileName1=System.currentTimeMillis();
File des=new File("Screenshots/" +fileName1 +".png");
//FileUtils.copyFile(src, des);
}

//windowHandle


//Switch to childwindow

public static void switchToChildWindow() {
	String Parent = driver.getWindowHandle();
	Set<String> Child = driver.getWindowHandles();
	for(String x:Child)
	{
		if(!Parent.equals(x))
		{
			driver.switchTo().window(x);
		}
	}
}

//JavascriptExecutor
//jsclick
public static void jsClick(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", e);

}

//scrolldown
public static void scrollDown(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",e);

}

//scrollUp

public static void scrollUp(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)",e);

}
}

	

