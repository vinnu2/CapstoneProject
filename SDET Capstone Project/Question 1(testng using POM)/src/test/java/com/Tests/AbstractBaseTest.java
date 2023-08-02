package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.Pages.automationpanda_Contact_Page;
import com.Pages.flipkart_search_page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractBaseTest {
	WebDriver driver;
	automationpanda_Contact_Page contactpage;
	flipkart_search_page searchpage;
	
	@BeforeSuite
	public void setUp() {
	WebDriverManager.chromedriver().setup();
	this.driver = new ChromeDriver();
	
	contactpage = new automationpanda_Contact_Page(driver);
	searchpage = new flipkart_search_page(driver);
	}
	
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}

}
