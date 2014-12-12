package com.mobica.jatr.SeleniumProj;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.*;

import static org.junit.Assert.*;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTest1 {

	private String baseUrl;
	private List<WebElement> elements;
	private WebDriver driver;
	

	@Test
	public void testE() {
		//baseUrl = "http://book.theautomatedtester.co.uk";
		baseUrl = "http://www.quackit.com/html/examples/html_tables_examples.cfm";
		
		//Chrome
		//System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		// Firefox
		driver = new FirefoxDriver();
		
		//IE
		//System.setProperty("webdriver.ie.driver", "C:\\IEdriver\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
		
		/*
		elements = driver.findElements(By.linkText("Chapter11"));
		Assert.assertEquals("Element not found", 1, elements.size());

		for (WebElement element : elements) {
			Assert.assertEquals("Element not found", "Chapter1",
					element.getText());
		}
		*/
		System.out.println("Page tittle: " + driver.getTitle());
		 WebElement simpleTable = driver.findElement(By.className("example5"));
		//Get all rows
		  List<WebElement> rows = simpleTable.findElements(By.tagName("tr"));
		  //assertEquals(3, rows.size());
		  
		  
		 
		 //Print data from each row
		  for (WebElement row : rows) {
		      List<WebElement> cols = row.findElements(By.tagName("td"));
		      for (WebElement col : cols) {
		         System.out.print(col.getText() + "\t");
		      }
		  }
		
		

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
