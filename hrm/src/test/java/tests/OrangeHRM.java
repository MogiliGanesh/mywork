package tests;

import com.Utils.TestBase;
import com.constants.Constants;
import java.io.IOException;
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

	@Test(priority = 1, description = "login functionality and validation")
	public void logIn() throws InterruptedException, IOException {

		Assert.assertEquals(driver.getTitle(), Constants.expected_title, " error");
		com.Pages.OrangeHRM o = PageFactory.initElements(driver, com.Pages.OrangeHRM.class);
		o.enter_UserName(Constants.userName);
		log.info("username entered");
		o.enter_password(Constants.password);
		log.info("password entered");
		o.click_logIn();
		log.info("logIn button clicked & validation starts");
		o.validation();

		log.info("validated succesfully");

	}

	@AfterMethod
	public void teatDown() {
		driver.close();
		log.info("browser closed");

	}

}