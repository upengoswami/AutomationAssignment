package com.mobile;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest  {
@Test
	public void test1() throws InterruptedException {
	
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		Thread.sleep(2000);
		
		WebElement elet= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(elet);
		Thread.sleep(5000);
		}
	
}
