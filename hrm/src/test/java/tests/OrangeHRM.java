package tests;

import com.Utils.TestBase;
import com.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRM extends TestBase {
	@BeforeMethod
	public void setUp() {
		initialization();
	}

	@Test
	public void logIn() throws InterruptedException {
	
		Assert.assertEquals(driver.getTitle(), Constants.expected_title);
		com.Pages.OrangeHRM o = PageFactory.initElements(driver, com.Pages.OrangeHRM.class);
		o.enter_UserName(Constants.userName);
		log.info("username entered");
		o.enter_password(Constants.password);
		log.info("password entered");
		o.click_logIn();
		log.info("logIn button clicked");
		Thread.sleep(5000);
		
		log.info("validation starts");
		Assert.assertEquals((driver.findElement(By.id("welcome")).getText()), Constants.welcomeAdmin);
	}
	@AfterMethod
	public void teatDown() {
		driver.close();
	}

}
