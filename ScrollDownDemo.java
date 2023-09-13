package com.mobile;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollDownDemo extends BaseTest {
	@Test
public void test() throws InterruptedException {
 
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	Thread.sleep(3000);
	
	//scrollToEndAction();
//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"WebView\"));")).click();
	Thread.sleep(10000);
}
}
