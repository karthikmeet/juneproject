package org.pageexecution;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoginPageExe.class, HomePageExe.class })
public class Execution {
	public static void main(String[] args) {
		
		Result runclasses = JUnitCore.runClasses(LoginPageExe.class, HomePageExe.class);
		System.out.println(runclasses.getFailureCount());
		System.out.println(runclasses.getIgnoreCount());
		System.out.println(runclasses.getRunCount());
		System.out.println(runclasses.getRunTime());	
	}
}
