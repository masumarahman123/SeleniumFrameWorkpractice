package com.qa.practice.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.practice.base.TestBase;
import com.qa.practice.pages.Loginclass;
import com.qa.practice.pages.PIMpage;

public class PIMpageTest extends TestBase{
	
	Loginclass lc;	
	PIMpage pp;
	
	@BeforeTest
	public void setup() throws IOException {
		driver_init();
		 lc=new Loginclass();
		pp= lc.dologin(pro.getProperty("username"), pro.getProperty("password"));
		 pp=new PIMpage();		
	}
	
	@Test	
	public void pim_show_Test(){		
		Assert.assertTrue(pp.pim_show());
	}
	
	@Test
	public void seach_option_Test(){		
		Assert.assertTrue(pp.seach_option());
	}
	
	@Test	
	public void desh_Board_Test()  {		
		Assert.assertTrue(pp.desh_Board());
	}
	
	@Test
	public void directory_page_Test()  {		
		Assert.assertTrue(pp.directory_page());
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}	
	
	
	
	
	
}
