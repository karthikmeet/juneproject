package org.pageexecution;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.pagefactory.LoginPageFactory;
import org.pageutils.BaseClass;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPageExe extends BaseClass {

	@Before
	public void before() {

		System.out.println("Before");
		
		browserlaunch();
		url("https://www.facebook.com/");
	}

	@Ignore
	@Test
	public void testcase1()
	{
		LoginPageFactory lp = new LoginPageFactory();
		System.out.println("testcase 1");
		
		type("yuvaraj", lp.getUsername());
		type("sekar", lp.getPassword());
	}
	
	@Test
	public void testcase2()
	{	
		LoginPageFactory lp = new LoginPageFactory();
		System.out.println("testcase 2");
		
		type("jalal", lp.getUsername());
		type("ahmed", lp.getPassword());
	}
	
	@Ignore
	@Test
	public void reportgeneration()
	{
		ExtentTest logger = extent.createTest("LoginPageTest");
		logger.log(Status.PASS, "Test success");
	}
}
