package com.qa.practice.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.practice.base.TestBase;
import com.qa.practice.pages.DirectoryPage;
import com.qa.practice.pages.Loginclass;
import com.qa.practice.pages.PIMpage;

public class DirectoryPageTest extends TestBase {

	Loginclass lc;
	PIMpage pp;
	DirectoryPage dp;
	@BeforeTest
	public void setup() throws IOException {
		driver_init();
		 lc=new Loginclass();		 
		 pp= lc.dologin(pro.getProperty("username"), pro.getProperty("password"));
		 pp=new PIMpage();				
		  dp=new  DirectoryPage();
		 
	}
	
	/*@Test
	public void  search_of_directoryTest() throws InterruptedException {
		 Thread.sleep(5000);
		Assert.assertTrue(dp.diretorySearch(null, null, null));
	}*/
	
	
	@Test
	public void resetbuttonTest()  {			
		Assert.assertTrue(dp.resetbutton());
	}
	
@AfterTest
public void tearDown() throws InterruptedException {
	 Thread.sleep(5000);
	driver.quit();
}
	
}
