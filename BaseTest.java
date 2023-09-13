package com.mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

		public AndroidDriver driver;
		public AppiumDriverLocalService service;
@BeforeMethod	
public void appiumConfigure() throws MalformedURLException, InterruptedException {
	// start appium services
	service=new AppiumServiceBuilder()
			.withAppiumJS(new File("C:\\Users\\AK\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
			.withIPAddress("127.0.0.1").usingPort(4723).build();
	service.start();
			
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("upen");
//		options.setApp("D:\\apk file\\Calculator_8.4.1 (520193683)_Apkpure.apk");
		options.setApp("D:\\apk file\\ApiDemos-debug.apk");
		//options.setApp("D:\\apk file\\General-Store.apk");
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		
		
}
public void scrollToEndAction()
{
	boolean canScrollMore;
	do
	{
	 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0));
	}while(canScrollMore);
}

public void longPressAction(WebElement ele)
{
	((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
			ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
					"duration",2000));
}
public void swipeAction(WebElement ele,String direction)
{
	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			"elementId", ((RemoteWebElement)ele).getId(),
		 
		    "direction", direction,
		    "percent", 0.75
		));		
}

@AfterMethod
public void testDown() {
	driver.quit();
	service.close();
}
}
