package stepDefinition;

import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
//	@After
//	public void tearDown() {
//		driver.close();
//	}

	WebDriver driver = null;
	@Given("browser open")
	public void browser_open() {
		System.setProperty("webdriver.chrome.driver", "./src/test/java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("open url")
	public void open_url() {
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
	}

	@Then("user enters username and password")
	public void user_enters_username_and_password() {

		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
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
		org.junit.Assert.assertTrue(act.equals(Exp));
	}

	@Then("user clicks on PIM")
	public void user_clicks_on_PIM() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
	}

	@Then("user clicks on add employee")
	public void user_clicks_on_add_employee() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
	}

	@Then("enter all details {string} and {string}")
	public void enter_all_details_and(String firstname, String lastname) throws InterruptedException {

		Thread.sleep(6000);
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		driver.findElement(By.id("lastName")).sendKeys(lastname);
	}

	@Then("user attach photograpth")
	public void user_attach_photograpth() throws IOException, InterruptedException {
//		driver.findElement(By.id("photofile")).click();
//		System.out.println("clicked on attach file");
//		Thread.sleep(5000);
//	Runtime.getRuntime().exec("C:/Users/Desktop/pp.exe");
//		Thread.sleep(10000);

	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
		driver.findElement(By.id("btnSave")).click();
	}

	@Then("new employee registered successfully {string}")
	public void new_employee_registered_successfully(String exp) throws InterruptedException {
		Thread.sleep(6000);
		Assert.assertTrue(driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value").equals(exp));
		String emp_id = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		System.out.println("emp id is " + emp_id);
	}

	@Then("user clicks on employee list")
	public void user_clicks_on_employee_list() {
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	}

	@Then("user enters employee info empname and id")
	public void user_enters_employee_info_empname_and_id() throws InterruptedException {
		driver.findElement(By.id("empsearch_id")).sendKeys(driver.findElement(By.xpath("//tr[1]//td[2]")).getText());Thread.sleep(5000);
		System.out.println("id entered"+"    "+driver.findElement(By.xpath("//tr[1]//td[2]")).getText());
		Thread.sleep(5000);
	}

	@Then("user clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException {
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(5000);
	}

	@Then("user selects the employee and clicks on delete button")
	public void user_selects_the_employee_and_clicks_on_delete_button() throws InterruptedException {
		List<WebElement> list = driver.findElements(By.xpath("//tr//td[2]"));
		if(list.size()>0) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().contains(driver.findElement(By.xpath("//tr[1]//td[2]")).getText())) {
				driver.findElement(By.name("chkSelectRow[]")).click();
				driver.findElement(By.id("btnDelete")).click();
				Thread.sleep(3000);
				try {
				Alert alt = driver.switchTo().alert();
				}
				catch(Exception e){
					System.out.println("no alert present");
				}
				Thread.sleep(3000);
				driver.findElement(By.id("dialogDeleteBtn")).click();
				System.out.println("emp deleted");
			}
		}
		}
		else System.out.println("no employee exist");
	}
	@Given("user should be logged in")
	public void user_should_be_logged_in() {
		String Exp = "http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/pim/viewEmployeeList";
		String act = driver.getCurrentUrl();
		org.junit.Assert.assertTrue(act.equals(Exp));		
	}

	@Then("user clicks on Leave link text")
	public void user_clicks_on_Leave_link_text() {
driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	}

	@Then("user enters leave period info")
	public void user_enters_leave_period_info() throws InterruptedException {
		Thread.sleep(10000);
		WebElement month=driver.findElement(By.id("leaveperiod_cmbStartMonth"));
//List<WebElement> list=month.findElements(By.tagName("options"));

Select sl=new Select(month);
sl.selectByIndex(2);
sl.getAllSelectedOptions();

WebElement date=driver.findElement(By.id("leaveperiod_cmbStartDate"));
//List<WebElement> list1=date.findElements(By.tagName("options"));

Select sl1=new Select(date);
sl1.selectByIndex(2);
System.out.println(sl1.getAllSelectedOptions());
		
	}

	@Then("user clicks on save button")
	public void user_clicks_on_save_button() throws InterruptedException {
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(5000);
	}
	
	@Then("user clicks on recruitment link text")
	public void user_clicks_on_recruitment_link_text() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		Thread.sleep(5000);
	}

	@Then("user clicks on candidates link")
	public void user_clicks_on_candidates_link() {
//		driver.findElement(By.id("menu_recruitment_viewCandidates")).click();	
		}

	@Then("user selects recruitment info")
	public void user_selects_recruitment_info() throws InterruptedException {
		Thread.sleep(5000);
	WebElement status=	driver.findElement(By.name("candidateSearch[status]"));
		Select ss=new Select(status);
		ss.selectByIndex(2);
		driver.findElement(By.id("candidateSearch_fromDate")).click();
		
		WebElement year=	driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sy=new Select(year);
		sy.selectByIndex(98);
		System.out.println(sy.getAllSelectedOptions());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table//tbody//tr[3]//td[4]")).click();
		Thread.sleep(5000);
		
		
	}

	@Then("user clicks on candidate search button")
	public void user_clicks_on_candidate_search_button() {
		driver.findElement(By.id("btnSrch")).click();	
		
	}

	
	
	
	
	
	
	
}
