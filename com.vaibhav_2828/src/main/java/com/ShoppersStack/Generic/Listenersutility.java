package com.ShoppersStack.Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenersutility implements ITestListener,ISuiteListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		JavaUtility java=new JavaUtility();

		TakesScreenshot ts=(TakesScreenshot)Base_Test.listenersDriver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotPath+java.localDateTime()+".png");
	    try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
