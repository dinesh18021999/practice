package com.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Input.class,Output.class})

public class ShiteLevelExecution {
	
	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(Input.class,Output.class);
		int runCount = runClasses.getRunCount();
		System.out.println(runCount);
		
		int failureCount = runClasses.getFailureCount();
		System.out.println(failureCount);
		
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println(ignoreCount);
		
	}
	

	
	
	
	

}
