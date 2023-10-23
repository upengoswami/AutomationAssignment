package DemoQa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeP {
	@Test
	public void home() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","D:\\upen_selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		
		
		String main_w= driver.getWindowHandle();
		System.out.println("main widow is...."+main_w);
		driver.findElement(By.xpath("//html/body/div[2]/div/div/div[1]/a/img")).click();
		Thread.sleep(2000);
		
		 Set<String> all_w=  driver.getWindowHandles();
		 Iterator<String> i1=all_w.iterator();
		while (i1.hasNext()) {
			 String child_w=i1.next();
			 System.out.println(child_w);
			 if (!main_w.equals(child_w)) {
				
				 driver.switchTo().window(child_w);
				 System.out.println("Child window is:"+child_w);
				 driver.close();
			}
		}
		 driver.switchTo().window(main_w);
		 Thread.sleep(2000);
		 System.out.println("main windwo is:"+main_w);
		 Thread.sleep(2000);
		
		 // ELEMENTS_-----------------
		 JavascriptExecutor up=(JavascriptExecutor)driver;
		 up.executeScript("window.scrollBy(0,500)","");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("div.card-body")).click();
		 Thread.sleep(2000);
		 
//		 driver.findElement(By.cssSelector("div.header-text")).click();
//		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Upendra Goswami");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("upengoswami@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys("210, Harinagar-2");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys("210, Harinagar-2,Udhna");
		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("button#submit")).click();
		//driver.findElement(By.cssSelector("button.text-right col-md-2 col-sm-12")).click();
//		driver.findElement(By.id("submit")).click();
//		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
//		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("button#rct-collapse.rct-collapse-btn")).click();
		//driver.findElement(By.cssSelector("div.check-box-tree-wrapper")).click(); 
//		Thread.sleep(2000);
//		for (int i = 0; i <=3; i++) {
//			driver.findElement(By.id("vfb-6-0"+i)).click();
//			Thread.sleep(2000);
//		}
//		
		
//		driver.findElement(By.id("item-2")).click();
//		Thread.sleep(2000);
//		for (int i = 0; i <=3; i++) {
//			driver.findElement(By.id("custom-control-label"+i)).click();
//			Thread.sleep(2000);
//		}
		JavascriptExecutor up1=(JavascriptExecutor)driver;
		 up.executeScript("window.scrollBy(0,500)","");
		 Thread.sleep(2000);
		//driver.findElement(By.cssSelector("li.btn btn-light active")).click();
		 driver.findElement(By.id("item-3")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Upendra");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("Goswami");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("upengoswami@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#age")).sendKeys("24");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#salary")).sendKeys("20000");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#department")).sendKeys("Testing");
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-record-1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Upendra");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("Goswami");
		Thread.sleep(2000);
		
//		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("upengoswami@gmail.com");
//		Thread.sleep(2000);
		
//		driver.findElement(By.cssSelector("input#age")).sendKeys("24");
//		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#salary")).sendKeys("20000");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#department")).sendKeys("Testing");
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("delete-record-1")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.id("item-4")).click();
		driver.findElement(By.partialLinkText("Links")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
