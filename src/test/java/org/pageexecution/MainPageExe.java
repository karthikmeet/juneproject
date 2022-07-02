package org.pageexecution;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPageExe {
	public static WebDriver driver;
	
	
	@Before
	public void browserlaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
		
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test2()
	{
		driver.get("https://www.gmail.com/");
	}
	
	@After
	public void browserclose()
	{
		driver.close();
	}
	
}
