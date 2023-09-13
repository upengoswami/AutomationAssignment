package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGWebDriverPractice {
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
	@Test(priority = 2)
	public void loginbutton() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void menuicon() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void allitem() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).click();
		Thread.sleep(2000);
	}
	@Ignore
	@Test(priority = 5)
	public void about() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]")).click();
		Thread.sleep(10000);
	}
	
	@Test(priority = 6)
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		Thread.sleep(2000);
	}
	
	@AfterTest
public void after() {
	System.out.println("bye-bye");
	driver.close();
}
}
