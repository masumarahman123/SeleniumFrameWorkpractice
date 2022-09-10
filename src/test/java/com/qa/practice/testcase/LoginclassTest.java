package com.qa.practice.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.practice.base.TestBase;
import com.qa.practice.pages.Loginclass;
import com.qa.practice.pages.PIMpage;

public class LoginclassTest extends TestBase{
	
	Loginclass lc;
	PIMpage pp;
	
	@BeforeTest
	public void setup() throws IOException  {		
		driver_init();
		lc=new Loginclass();
				 pp=new PIMpage();					 
	}
	
	
	@Test
	public void logo_Orange_HRM_Test() {		
		Assert.assertTrue(lc.logo_Orange_HRM());		
	}
	
	@Test
	public void valid_login_Test() {			
		//pp=lc.dologin("Admin", "admin123");
		pp=lc.dologin(pro.getProperty("username"),pro.getProperty("password" ));
		Assert.assertTrue(pp.pim_show());
	}
	
	@Test
	public void child_url_Test(){	
	Assert.assertTrue(lc.child_url());	
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
}
