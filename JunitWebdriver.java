package com.unit1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitWebdriver {
	
	WebDriver driver=null;
	
	@Before
public void beforelogin() throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\upen_selenium\\chromedriver_win32\\chromedriver.exe");
	
	 driver=new ChromeDriver(); //empty browser 
	
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
}

@Test
public void login() throws InterruptedException {
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
}

@After
public void afterlogin() {
	System.out.println("bye bye.....");
	driver.close();
}
}
