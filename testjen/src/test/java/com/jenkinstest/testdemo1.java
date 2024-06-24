package com.jenkinstest;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testdemo1 {

	WebDriver driver= null;
	//@Parameters("Browser")

	@Test
	public void testbrowser() throws Exception
	{
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--headless");
//		opt.addArguments("--no-sandbox");
//		opt.addArguments("--disable-dev-shm-usage");
//		driver=new ChromeDriver(opt);
	
	
		WebDriver driver = new ChromeDriver();
	
//		FirefoxProfile profile = new FirefoxProfile();
//		FirefoxOptions options = new FirefoxOptions();
//		options.setProfile(profile);
//		driver = new FirefoxDriver(options);
	Thread.sleep(3000);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Assert.assertTrue(driver.getTitle().contains("Orange"), "Title does not match");
	Thread.sleep(3000);
	driver.quit();
	}

}
