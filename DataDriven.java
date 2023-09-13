package com.mvn;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDriven {
	public String[][] readExcel() throws InvalidFormatException, IOException {
		String[][] data=null;
		
		//1. to set file path
		String file_path="D:\\upen_selenium\\11AprilPOI.xlsx";
		
		//2.to make file
		File file=new File(file_path);
		
		//3. to open workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//4. to open a particular sheet
		Sheet sheet=workbook.getSheet("Sheet1");
		
		//5. to get a particular row
		// no of row
		int n_row=sheet.getPhysicalNumberOfRows();
		System.out.println("no of row:"+n_row);
		
		data=new String[n_row][];
		
		for (int i = 0; i < data.length; i++) {
			//6. to select row
			Row row=sheet.getRow(i);
			
			//7. get particular col
			int n_col=row.getPhysicalNumberOfCells();
			System.out.println("no of cell in each row are..."+n_col);
			
			data[i]=new String[n_col];
			for (int j = 0; j < data[i].length; j++) {
				
				//8. to select a col
				Cell cell=row.getCell(j);
				
				//9.to set cell to string
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
				
				
			}
		}	
		return data;
	}
	WebDriver driver=null;
	@Test
	public void test() throws InterruptedException, InvalidFormatException, IOException {
		  
				String[][] data=readExcel();
				System.setProperty("webdriver.chrome.driver", "D:\\upen_selenium\\chromedriver-win64\\chromedriver.exe");
				
				
				for (int i = 0; i < data.length; i++) {
					driver=new ChromeDriver(); //empty browser 
					
					driver.manage().window().maximize();
					driver.get("https://www.saucedemo.com/");
					Thread.sleep(2000);
					driver.findElement(By.id("user-name")).sendKeys(data[i][0]);
					Thread.sleep(2000);
					
					driver.findElement(By.id("password")).sendKeys(data[i][1]);
					Thread.sleep(2000);

					driver.findElement(By.id("login-button")).click();
					Thread.sleep(2000);
				
					if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory,html")) {
						System.out.println("Your test is passed");
					}else {
						System.out.println("fail");
					}
					driver.findElement(By.id("react-burger-menu-btn")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.id("logout_sidebar_link")).click();
					driver.close();
				}		
				
			
		}
}
