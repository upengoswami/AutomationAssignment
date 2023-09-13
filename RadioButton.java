package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		// setup for chrome driver
		
		System.setProperty("webdriver.chrome.driver","D:\\upen_selenium\\chromedriver-win64\\chromedriver.exe");
		
		// setup for Firfox driver
		//System.setProperty("webdriver.gecko.driver","D:\\upen_selenium\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		
		//to open empty browser
		WebDriver driver=new ChromeDriver();
//		WebDriver driver1=new FirefoxDriver();
		
		
		 
		//to maximize window
		//driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		// to open the Website
		//driver.get("https://careercenter.tops-int.com/");
		driver.get("https://demo.guru99.com/test/radio.html");
		
		Thread.sleep(2000);
		
		for (int i = 0; i <=3; i++) {
			driver.findElement(By.id("vfb-7-1"+i)).click();
			Thread.sleep(2000);
		}
		
		driver.close();
	}
}
