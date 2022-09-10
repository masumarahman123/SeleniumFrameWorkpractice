package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.practice.base.TestBase;

public class DirectoryPage extends TestBase {
	//...//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']
	//...//span[@class='oxd-text oxd-text--span']
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")
	WebElement directory;
	@FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
	WebElement employeename;
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[1]")	
	WebElement jojtittle;
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	WebElement location;
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchofdirectory;
	@FindBy(xpath="//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']")
	WebElement recordfound;
	
	@FindBy(xpath="//button[@type='reset']")
	WebElement reset;
	
	WebDriverWait wait=new WebDriverWait(driver,5);
	public DirectoryPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean diretorySearch(String name,String tittle,String city) {
		wait.until(ExpectedConditions.visibilityOf(recordfound));
		employeename.clear();
		employeename.sendKeys("Odis Adalwin");
		jojtittle.clear();
		jojtittle.sendKeys("Chief Technical Officer");				
		location.clear();
		location.sendKeys("HQ - CA, USA");
		 employeename.isDisplayed();
		jojtittle.isDisplayed();
		location.isDisplayed();
		return recordfound.isDisplayed();
	}
	public boolean resetbutton() {
		wait.until(ExpectedConditions.visibilityOf(reset));
		return reset.isDisplayed();
	}
	public boolean search_of_directory() {
		wait.until(ExpectedConditions.visibilityOf(searchofdirectory));
		return searchofdirectory.isDisplayed();
	}
}
