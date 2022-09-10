package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.practice.base.TestBase;

public class Loginclass extends TestBase {
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement logoOrangeHRM;
	
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	WebElement childurl;
	
		
	WebDriverWait wait=new WebDriverWait(driver, 5);
	
	public Loginclass() {
		PageFactory.initElements(driver, this);
	
	}
	
	
	public PIMpage dologin(String uname,String pass) {
		wait.until(ExpectedConditions.visibilityOf(login));
		userName.clear();
		userName.sendKeys("Admin");
		password.clear();
		password.sendKeys("admin123");
		login.click();
		return new PIMpage();
	}
	public boolean logo_Orange_HRM() {
		wait.until(ExpectedConditions.visibilityOf(logoOrangeHRM));
		return logoOrangeHRM.isDisplayed();
	}
	
	
	public boolean child_url() {
		wait.until(ExpectedConditions.visibilityOf(childurl));
		return childurl.isDisplayed();
	}  
	
	
}
