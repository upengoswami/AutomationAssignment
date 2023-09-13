package com.assign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\upen_selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			Thread.sleep(2000);
			
			
			// String getHeading=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/table/thead/tr/th[1]")).getText();
			
			List<WebElement> th=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[1]/table/thead/tr/th"));
			System.out.println("no of col is..."+th.size());
			
			for (int i = 1; i < th.size(); i++) {
				String th_name=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/table/thead/tr/th[+i+]")).getText();
				System.out.print("    |    "+th_name);
				
				Thread.sleep(2000);
				driver.close();
			}
		}
}
