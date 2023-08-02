package com.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class flipkart_search_pageTest extends AbstractBaseTest {
	
	@Test(priority = 1, enabled = true)
	public void serach_page_Test() {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement flipkartText = driver
				.findElement(By.xpath("//img[@title='Flipkart']"));
		if (flipkartText.isDisplayed())
			System.out.println("Flipkart is present on left side of the top");
		else
			System.out.println("Flipkart is not present on left side of the top");
		searchpage.search();
		searchpage.searchButton();
		System.out.println(searchpage.noOfItems());
		searchpage.firstItem();
		String ExpectedTitle = "Iphone 14- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		String NewTitle = driver.getTitle();
		Assert.assertEquals(NewTitle, ExpectedTitle, "Verify Title of the page");
		
	}
}