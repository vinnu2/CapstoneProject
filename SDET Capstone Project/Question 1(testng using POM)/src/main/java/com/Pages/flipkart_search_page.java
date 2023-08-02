package com.Pages;

import org.openqa.selenium.WebDriver;

import com.Elements.flipkart_Search_Page_Elements;

public class flipkart_search_page {
	WebDriver driver;
	flipkart_Search_Page_Elements searchPageElements;
	
	public flipkart_search_page(WebDriver driver) {
		this.driver= driver;
		searchPageElements = new flipkart_Search_Page_Elements(driver);
	}
	
	public void search() {
		searchPageElements.searchbar.sendKeys("iphone 14");
	}
	
	public void searchButton() {
		searchPageElements.searchbarClick.click();
	}
	
	public String noOfItems() {
		return searchPageElements.NoOfItems.getText();
	}
	
	public void firstItem() {
		searchPageElements.FirstSearch.click();
	}
}
