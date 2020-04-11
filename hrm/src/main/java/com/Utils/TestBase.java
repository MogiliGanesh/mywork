package com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public static final Logger log=Logger.getLogger(TestBase.class);
	
	

	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/main/java/com/Utils/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialization() {
		String browserName = prop.getProperty("browser");
		PropertyConfigurator.configure("log4j.properties");
		

		if (browserName.equals("c")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome_path"));
			driver = new ChromeDriver();
			log.info("broswer opened");
		} else if (browserName.equals("i")) {
			System.setProperty("webdriver.ie.driver", prop.getProperty("ie_path"));
			driver = new InternetExplorerDriver();
			log.info("broswer opened");
		}

		driver.manage().window().maximize();
		log.info("broswer windows maximized");
		driver.manage().deleteAllCookies();
		log.info("broswer cookies deleted");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
		log.info("broswer url entered");
		System.out.println("current url is   "+driver.getCurrentUrl());
		
		System.out.println("page source   "+driver.getPageSource());
		System.out.println("current title   "+driver.getTitle());
		System.out.println("class   "+driver.getClass());

	}

}
