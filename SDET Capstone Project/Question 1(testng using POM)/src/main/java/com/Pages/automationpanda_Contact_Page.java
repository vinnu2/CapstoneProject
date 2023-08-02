package com.Pages;

import org.openqa.selenium.WebDriver;

import com.Elements.automationpanda_Contact_page_Elements;

public class automationpanda_Contact_Page {
	WebDriver driver;
	automationpanda_Contact_page_Elements contactPageElements;
	
	public automationpanda_Contact_Page(WebDriver driver) {
		this.driver = driver;
		contactPageElements = new automationpanda_Contact_page_Elements(driver);	
	}
	public void contactLink() {
		contactPageElements.contactlink.click();
	}
	
	public void name() {
		contactPageElements.NameField.sendKeys("Keerthi");
	}
	
	public void email() {
		contactPageElements.EmailField.sendKeys("keerthi@gmail.com");
	}
	
	public void comment() {
		contactPageElements.CommentField.sendKeys("This is my Automation Code");
	}
	
	public void contactButton() {
		contactPageElements.ContactMe.click();
	}
	
	public boolean displayMessage() {
		return contactPageElements.Message.isDisplayed();
	}
}