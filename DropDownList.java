package com.assign;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\upen_selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://output.jsbin.com/osebed/2");
			Thread.sleep(2000);
			
			WebElement e1=driver.findElement(By.id("fruits"));
			
			Select s1=new Select(e1);
			
			s1.selectByIndex(0);
			Thread.sleep(2000);
			
			s1.selectByValue("orange");
			Thread.sleep(2000);
			
			
			s1.selectByVisibleText("Apple");
			Thread.sleep(2000);
			
			driver.close();
		}
}
