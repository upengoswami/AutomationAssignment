package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDependent {
WebDriver driver=null;
	
	@Test
public void before() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\upen_selenium\\chromedriver-win64\\chromedriver.exe");
	
	 driver=new ChromeDriver(); //empty browser 
	
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
}

	@Test(dependsOnMethods = {"before"} )
	public void enterusername() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = {"enterusername"} )
public void enterpassword() throws InterruptedException {
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
}
	



	@Test(dependsOnMethods = {"enterpassword"} )
public void after() {
	System.out.println("bye-bye");
	driver.close();
}
	
	
}

