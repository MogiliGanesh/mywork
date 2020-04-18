package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	WebDriver driver=null;
	@Given("browser open")
	public void browser_open() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    }

	@When("open url")
	public void open_url() {
	   driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
	}
	@Then("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    
	
	 driver.findElement(By.id("txtUsername")).sendKeys(string);
	 driver.findElement(By.id("txtPassword")).sendKeys(string2);
	 }

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	  driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user is logged in")
	public void user_is_logged_in() {
		String Exp = "http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/pim/viewEmployeeList";
		String act = driver.getCurrentUrl();
		System.out.println("expected    " + Exp);
		System.out.println("actual    " + act);
		if (!(act.equals(Exp))) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(src, new File("./failedTestScreenshots" + "/loginFail.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		org.junit.Assert.assertTrue( act.equals(Exp));
	}

	@Then("Close the browser")
	public void close_the_browser() {
	   driver.quit();
	}

}
