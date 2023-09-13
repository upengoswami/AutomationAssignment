package com.mobile;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class GeneralStore extends BaseTest {
@Test
	public void fillform() throws InterruptedException {
	
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"Afghanistan\"));")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("upen goswami");
		driver.hideKeyboard();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		driver.findElement(By.xpath("//android.widget.Button[@text='Let's  Shop']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"Nike Blazer Mid '77\"));")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000);
	}
}
