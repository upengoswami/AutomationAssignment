package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\upen_selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			
			WebElement mousElement=driver.findElement(By.id("email"));
			
			Actions actions=new Actions(driver);
			
			Action a1=actions.moveToElement(mousElement)
					.click()
					.keyDown(mousElement, Keys.SHIFT)
					.sendKeys("upen")
					.keyUp(mousElement, Keys.SHIFT)
					.doubleClick()
					.contextClick()
					.build();
			
			a1.perform();
			Thread.sleep(2000);
			driver.close();
		}
}
