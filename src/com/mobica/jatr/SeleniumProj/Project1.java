package com.mobica.jatr.SeleniumProj;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

@FixMethodOrder(org.junit.runners.MethodSorters.NAME_ASCENDING)
public class Project1 {
	private static WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		driver = new FirefoxDriver(); 
		//driver.manage();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Before
	public void setUp() throws Exception {
		baseUrl = "https://www.google.pl";
	}

	@Test
	public void atestJava() throws Exception {
		//WebElement element;
		driver.get(baseUrl + "/");
		//WebElement element = ((FindsById)driver).findElementById("verifybutton");
		driver.findElement(By.id("gbqfq")).clear();
		driver.findElement(By.id("gbqfq")).sendKeys("Spacecraft wiki");
		driver.findElement(By.id("gbqfb")).click();
		driver.findElement(
				By.linkText("Spacecraft - Wikipedia, the free encyclopedia"))
				.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
		}
		try {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./tmp/screenshot.png"));
		} catch(Exception e) {
			
		}
		Thread.sleep(1000);
		///System.out.println(driver.getPageSource());
	}

	@Test
	public void ztestJava() throws Exception {
		WebElement szukaj = driver.findElement(By
				.linkText("sub-orbital spaceflight"));
		szukaj.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
		;
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

}
