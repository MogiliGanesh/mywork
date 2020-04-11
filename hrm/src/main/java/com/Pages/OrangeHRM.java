package com.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class OrangeHRM {
	@FindBy(id="txtUsername")
	WebElement username;	
	public void enter_UserName(String usernames) {
		username.clear();
		username.sendKeys(usernames);
	}
	@FindBy(id="txtPassword")
	WebElement password;	
	public void enter_password(String passwords) throws InterruptedException  {
		password.clear();
		password.sendKeys(passwords);
		Thread.sleep(2000);
	}
	@FindBy(id="btnLogin")
	WebElement logIn;	
	public void click_logIn() throws InterruptedException  {
		logIn.click();
		
	}
	
	
	
	
	
	
	
	
	
}
