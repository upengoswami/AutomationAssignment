package com.assign;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\upen_selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			Thread.sleep(2000);
			
			WebElement cust_id=driver.findElement(By.name("cusid"));
			cust_id.sendKeys("123");
			Thread.sleep(3000);
			
			driver.findElement(By.name("submit")).click();
			
			Alert a1=driver.switchTo().alert();
			System.out.println("First alert msg:"+a1.getText());
			a1.accept();
			Thread.sleep(3000);
			
			Alert a2=driver.switchTo().alert();
			System.out.println("Second msg:"+a2.getText());
			a2.accept();
			Thread.sleep(10000);
			driver.close();
		}
}
