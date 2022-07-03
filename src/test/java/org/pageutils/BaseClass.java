package org.pageutils;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
		
		reporter = new ExtentHtmlReporter("./BasicReport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@After
	public void after()
	{
		extent.flush();
	}
	
	
	public static void browserlaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void type(String data, WebElement element)
	{
		element.sendKeys(data);
	}
	
	public static void url(String link)
	{
		driver.get(link);	
	}
	
}
