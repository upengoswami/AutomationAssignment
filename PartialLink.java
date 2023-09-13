package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\upen_selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("file:///D:\\workspace\\11April_selenium\\src\\com\\tops_selenium\\index.html");
			Thread.sleep(3000);
			
			driver.findElement(By.partialLinkText("cli")).click();
			Thread.sleep(2000);
			
//			driver.findElement(By.xpath("/html/body/a[2]")).click();
//			Thread.sleep(2000);
			
			driver.close();
			
		}
}
