package com.qa.practice.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static Properties pro;
	public static FileInputStream fis;
	public static WebDriver driver;
	
	public void driver_init() throws IOException {
		
		 pro=new Properties();
		
		 fis=new FileInputStream("C:\\Users\\MM A Chowdhury\\eclipse-workspace\\SeleniumFrameWorkpractice\\"
				+ "src\\main\\java\\com\\qa\\practice\\config\\configaration.properties");
		
		pro.load(fis);
		
		
		String browser_name=pro.getProperty("Browser");
		
		if(browser_name.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
		}
		
		else if(browser_name.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver =new FirefoxDriver();
		}
		
		else if(browser_name.equalsIgnoreCase("opera")) {
	
          }

		else if(browser_name.equalsIgnoreCase("safari")) {
	
       }
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(3l, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}	
	
	
	
public static void main(String[]args) throws IOException {
    		
	TestBase tb =new TestBase();
	tb.driver_init();
}
	
}
