package com.Utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

 class PracticeScripts extends TestBase {
// code for OrangeHRM_Leave_LeaveList
	@Test(enabled=false, description=" code for OrangeHRM_Leave_LeaveList")
	
	public void Calendar() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome_path"));
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		driver.manage().window().maximize();
		log.info("broswer windows maximized");
		driver.manage().deleteAllCookies();
		log.info("broswer cookies deleted");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		log.info("broswer url entered");

		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");

		driver.findElement(By.id("btnLogin")).click();

		WebElement leaveBtn = driver.findElement(By.xpath("//b[contains(text(),'Leave')]"));
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(leaveBtn).build().perform();

		driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveList']")).click();

		driver.findElement(By.xpath("//input[@id='calFromDate']")).click();

		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		System.out.println("check point month");
		Select s = new Select(month);
		s.selectByVisibleText("Jun");

		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1 = new Select(year);
		s1.selectByVisibleText("2019");

		Thread.sleep(5000);

		String beforeXPATH = "//div[@id='ui-datepicker-div']//tr[";

		String afterXPATH = "]//td[";

		List<WebElement> list = driver.findElements(By.xpath("/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr/td"));
		Thread.sleep(5000);

		System.out.println("Size of the list ==  " + list.size());

		list.get(23).click();
		Thread.sleep(5000);

	}

}

class Links extends TestBase{
	String url;
	@Test(enabled=false,description="code for OrangeHRM_LogIn_BrokenLinks")
	public void BrokenLinks() throws MalformedURLException, IOException {
	System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome_path"));
	driver = new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

	driver.manage().window().maximize();
	log.info("broswer windows maximized");
	driver.manage().deleteAllCookies();
	log.info("broswer cookies deleted");
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	log.info("broswer url entered");

	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");

	driver.findElement(By.id("btnLogin")).click();
	
	List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
	List activeLinks=new ArrayList();
	for(WebElement element:totalLinks) {
		if(element.getAttribute("href") != null) {
			
			activeLinks.add(element);
		}
		
		else
			System.out.println(element.getAttribute("href")+"   broken");
	}
	
	System.out.println(activeLinks.size()+"    activeLinks");
	System.out.println(totalLinks.size()+"    totalLinks");
	
for(int i=0;i<totalLinks.size();i++) {
String url=totalLinks.get(i).getAttribute("href");
	System.out.println(totalLinks.get(i).getAttribute("href"));
}
	
	

/*	  HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
		conn.connect();
		conn.getResponseMessage();
		conn.disconnect();
	*/
	
	}	
}



class ElementColour extends TestBase{
@Test(description="colour_of_an_element")
public void ColourOfElement() {
		initialization();
		WebElement logInButton=driver.findElement(By.id("btnLogin"));
		String colour=logInButton.getCssValue("color");
		System.out.println(colour+"   Colour");
		String colourBackground=logInButton.getCssValue("background-color");
		String colourHex=Color.fromString(colour).asHex();
		String backGroundHex=Color.fromString(colourBackground).asHex();
		
		System.out.println(colourHex+"   colour of text");
		System.out.println(backGroundHex+"   backGroundHex of text");
	}
}
