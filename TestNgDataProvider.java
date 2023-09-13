package com.testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class TestNgDataProvider {
	@DataProvider(name="upen")
	public Object[][] input() {
		return new Object[][] {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"}};
		
	}
	  @Test(dataProvider = "upen")
public void f(String username,String password) throws InterruptedException {
	  WebDriver driver=null;
		
			System.setProperty("webdriver.chrome.driver", "D:\\upen_selenium\\chromedriver-win64\\chromedriver.exe");
			
			 driver=new ChromeDriver(); //empty browser 
			
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
		
			driver.findElement(By.id("user-name")).sendKeys(username);
			Thread.sleep(2000);
			
			driver.findElement(By.id("password")).sendKeys(password);
			Thread.sleep(2000);

			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
		
			if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory,html")) {
				System.out.println("Your test is passed");
			}else {
				System.out.println("fail");
			}
			
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("logout_sidebar_link")).click();
			driver.close();
		
	}
}
