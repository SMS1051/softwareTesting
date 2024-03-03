		package org.bas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BASIC {

	public static WebDriver d ;
	
	public static void Browser() {
		
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		
	}
	
	public static void lanchBrowser() {
		
		WebDriverManager.firefoxdriver().setup();
		d = new FirefoxDriver();
		
	}
	public static void WindowMaximize() {
		d.manage().window().maximize();
		
	}
	
	public static void launchURL(String j ) {
		d.get(j);
		
	}
	public static void pageTitle() {
		String title = d.getTitle();
		System.out.println(title);
		
	}
	public static void currentURL() {
		String url = d.getCurrentUrl();
		System.out.println(url);
			
	}
	public static void passText(String txt,WebElement ele) {
		ele.sendKeys(txt);
		
	}
	public static void close() {
		d.close();
		
	}
	public static void closeEntireBrowser() {
		d.quit();
	}
	public static void CllickButton(WebElement exe) {
		exe.click();
	}
	public static void screenShort(String imgName) throws IOException {
		TakesScreenshot o = (TakesScreenshot) d ;
		File file = o.getScreenshotAs(OutputType.FILE);
		File f = new File("Location +imgName.png");
		FileUtils.copyFile(file, f);
	}
	
	private static  Actions a ;
	
	public static void MoveTheCurser(WebElement targetElement) {
		a = new Actions(d);
		a.moveToElement(targetElement).perform();
	}
	
	
	public static void DragDrop(WebElement dragWebElement,WebElement dragElement) {
		a = new Actions(d);
		a.dragAndDrop(dragWebElement, dragElement).perform();
		
	}
	public static void DoubleClick(WebElement clickElement) {
		
		a = new Actions(d);
		a.doubleClick().perform();
	}
	
	public static JavascriptExecutor js ;
	
	public static void ScrollThePage(WebElement element) {
		
		js = (JavascriptExecutor) d ;
		js.executeScript("arguments[0].ScrollIntoView(false)", element);
	}

public static void ExcelRead(String sheetName , int rowNum , int cellNum ) throws IOException {
		
		File f = new File("Excell location.xslx");
	
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet mysheet = wb.getSheet("Data");
			
			Row r = mysheet.getRow(rowNum);
				Cell c = r.getCell(cellNum);		
				int cellType = c.getCellType();
				String value = " ";
				
				if (cellType==1) {
					String value2 = c.getStringCellValue();
					System.out.println(d);
				}
				 
				else if (DateUtil.isCellDateFormatted(c)) {
					Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yy");
				String value1 = s.format(dd);
				
				}
				
				 
				 else {
					double d = c.getNumericCellValue();
					long o = (long) d ;
					String valueof = String.valueOf(o);
					System.out.println(valueof);
					
				}	
}

public static void CreateNewExcellFile(int rowNum , int cellNum , String WriteData) throws IOException {
	
	File f = new File("Excell Location.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet newsheet = w.createSheet("Datas");
	Row newRow = newsheet.createRow(rowNum);
	Cell newCell = newRow.createCell(cellNum);
	newCell.setCellValue(WriteData);
	FileOutputStream fos = new FileOutputStream(f);
	w.write(fos);
	
}

public static void CreatCell(int getRow,int creCell , String newData) throws IOException {
	
	File f = new File("Excell File.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.createSheet("Datas");
	Row r = s.createRow(getRow);
	Cell c = r.createCell(creCell);
	c.setCellValue(newData);
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	
	
}
public static void creatRow(int creRow , int creCell , String newData) throws IOException {
	
	File f = new File("Excell File.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.createSheet("Datas");
	Row r = s.createRow(creRow);
	Cell c = r.createCell(creCell);
	c.setCellValue(newData);
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	
}

public static void updateDataToParticularCell(int getTheRow , int getTheCell , String existingData ,String writeNewData ) throws IOException {
	
	File f = new File("Excell File.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.createSheet("Datas");
	Row r = s.createRow(getTheRow);
	Cell c = r.createCell(getTheCell);
	String str = c.getStringCellValue();
	if (str.equals(existingData)) {
		c.setCellValue(writeNewData);
	}
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
}
}

