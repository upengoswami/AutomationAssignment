package com.mobile;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CalcultorDemo extends BaseTest{
@Test
	public void cal() throws InterruptedException {
	driver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
	Thread.sleep(2000);
	
//		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
//		Thread.sleep(2000);
//	
//		driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
//		Thread.sleep(2000);
	
	System.out.println("ans is :"+driver.findElement(By.id("com.google.android.calculator:id/formula")).getText());
	Thread.sleep(2000);
	}
}
