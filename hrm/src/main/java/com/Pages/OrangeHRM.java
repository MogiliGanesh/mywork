package com.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.Utils.TestBase;
import com.constants.Constants;

public class OrangeHRM extends TestBase {
	@FindBy(id = "txtUsername")
	WebElement username;

	public void enter_UserName(String usernames) {
		username.clear();
		username.sendKeys(usernames);
	}

	@FindBy(id = "txtPassword")
	WebElement password;

	public void enter_password(String passwords) throws InterruptedException {
		password.clear();
		password.sendKeys(passwords);
		Thread.sleep(2000);
	}

	@FindBy(id = "btnLogin")
	WebElement logIn;

	public void click_logIn() throws InterruptedException {
		logIn.click();
	}

	public void validation() {
		String Exp = "http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/pim/viewEmployeeList";
		String act = driver.getCurrentUrl();
		System.out.println("expected    " + Exp);
		System.out.println("actual    " + act);
		if (!(act.equals(Exp))) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(src, new File(Constants.screenshot_dir + "/loginFail.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Assert.assertTrue(act.equals(Exp), "LogIn Failed - validation error");

	}

	@FindBy(linkText = "Logout")
	WebElement logout;
	public void logOut() {
		logout.click();
	}
	
	@FindBy(id = "welcome")
	public static WebElement welcome;

	public void logOClickOnWelcomeAdmin_Link() {
		welcome.click();
	}

	@FindBy(id = "spanMessage")
	public static WebElement span;

}
