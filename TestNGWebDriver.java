package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGWebDriver {
	WebDriver driver=null;
	
	@BeforeTest
public void before() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\upen_selenium\\chromedriver-win64\\chromedriver.exe");
	
	 driver=new ChromeDriver(); //empty browser 
	
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
}

	@Test(priority = 1)
public void enterpassword() throws InterruptedException {
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
}
	
	@Test(priority = 0)
public void enterusername() throws InterruptedException {
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(2000);
}

	@AfterTest
public void after() {
	System.out.println("bye-bye");
	driver.close();
}
}

