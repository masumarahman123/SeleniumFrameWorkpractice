package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.practice.base.TestBase;

public class PIMpage extends TestBase{
/*(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]
 * //*[contains(text(),'PIM')]
 * //a[@class='oxd-main-menu-item active']
 * (//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[9]
 */

	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")
	WebElement pim;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[1]")
	WebElement search;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement deshboard;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[9]")
	WebElement directory;
	
	WebDriverWait wait=new WebDriverWait(driver, 5);
	public PIMpage() {
		PageFactory.initElements(driver, this);
	}
	public boolean pim_show() {
		wait.until(ExpectedConditions.visibilityOf(pim));
		return pim.isDisplayed();
	}
	public boolean seach_option() {	
		wait.until(ExpectedConditions.visibilityOf(search));
		return search.isDisplayed();
	}
	
	public boolean desh_Board() {
		wait.until(ExpectedConditions.visibilityOf(deshboard));
		return deshboard.isDisplayed();
		
			}
	
	public boolean directory_page() {
		wait.until(ExpectedConditions.visibilityOf(directory));
		directory.click();
		return directory.isDisplayed();
	}
	
}