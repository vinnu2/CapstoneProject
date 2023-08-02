package com.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class flipkart_Search_Page_Elements {
	private WebDriver driver;
	
	public flipkart_Search_Page_Elements(WebDriver driver2) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver2, 60), this);
	}
	
	@FindBy(name = "q") public WebElement searchbar;
	
	@FindBy(className = "_34RNph") public WebElement searchbarClick;

	@FindBy(className = "_10Ermr") public WebElement NoOfItems;

	@FindBy(className = "_4rR01T") public WebElement FirstSearch;
}
