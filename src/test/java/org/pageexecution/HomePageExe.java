package org.pageexecution;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.pagefactory.LoginPageFactory;
import org.pageutils.BaseClass;


public class HomePageExe extends BaseClass {
	@Before
	public void before() {

		System.out.println("Before");
		
		browserlaunch();
		url("https://www.facebook.com/");
	}

	@Ignore
	@Test
	public void testcase3()
	{
		LoginPageFactory lp = new LoginPageFactory();
		System.out.println("testcase 1");
		
		type("selva", lp.getUsername());
		type("kumar", lp.getPassword());
	}
	
	@Test
	public void testcase4()
	{	
		LoginPageFactory lp = new LoginPageFactory();
		System.out.println("testcase 2");
		
		type("Raj", lp.getUsername());
		type("kumar", lp.getPassword());
	}

}
