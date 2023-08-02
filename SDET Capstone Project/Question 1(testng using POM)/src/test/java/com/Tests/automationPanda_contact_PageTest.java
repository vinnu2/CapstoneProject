package com.Tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.*;

public class automationPanda_contact_PageTest extends AbstractBaseTest {
	@Test
	public void contact_page_test() {
		driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    String ExpectedTitle = "Want to practice test automation? Try these demo sites! | Automation Panda";
	    String newTitle = driver.getTitle();
	    Assert.assertEquals(newTitle, ExpectedTitle, "Verify Title of the page");
	    contactpage.contactLink();
		String ExpectedTitle1 = "Contact | Automation Panda";
		String newTitle1 = driver.getTitle();
	    Assert.assertEquals(newTitle1, ExpectedTitle1, "Verify Title of the page");
	    contactpage.name();
	    contactpage.email();
	    contactpage.comment();
	    contactpage.contactButton();
	    System.out.println(contactpage.displayMessage());
	}
}
