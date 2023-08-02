package com.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class automationpanda_Contact_page_Elements {
	
private WebDriver driver;

	public automationpanda_Contact_page_Elements(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }
	
	@FindBy(id = "menu-item-10") public WebElement contactlink;

	@FindBy(id = "g3-name") public WebElement NameField;

	@FindBy(name = "g3-email") public WebElement EmailField;
	
	@FindBy(name = "g3-message") public WebElement CommentField;

	@FindBy(xpath = "//*[@id='contact-form-3']/form/div/div[4]/button") 
	public WebElement ContactMe;

	
	@FindBy(id = "contact-form-success-header")	public WebElement Message;


}
