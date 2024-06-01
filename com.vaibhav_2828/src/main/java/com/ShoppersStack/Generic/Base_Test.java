package com.ShoppersStack.Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack.Pom.Home_Page;
import com.ShoppersStack.Pom.Login_Page;
import com.ShoppersStack.Pom.Welcome_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Test {
	public WebDriver driver;
	static WebDriver listenersDriver;
	public FileUtility file = new FileUtility();
	public Welcome_Page welcomePage;
	public Login_Page loginPage;
	public Home_Page homePage;
	public JavaUtility javautil = new JavaUtility();
	public ExtentReports report;
	public WebdriverUtility webdtiverutil = new WebdriverUtility();
	public ExtentTest test;

	@BeforeSuite
	public void beforesuite() {
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
		ExtentSparkReporter spark = new ExtentSparkReporter(
				FrameWorkConstants.reportPath + javautil.localDateTime() + ".html");
		report = new ExtentReports();
		report.attachReporter(spark);
		test = report.createTest("Demo");

	}

	@BeforeClass
	public void beforeClass() throws IOException {
		System.out.println("BeforeClass");

		 //String browser=FrameWorkConstants.chromeValue;
		 //String url=file.readDataFromPropertyFile("url");

		String browser = System.getProperty("browser");
		String url=System.getProperty("url");
		 

		if (browser.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.contains("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.contains("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Enter Valid Browser Name");
		}
		
		listenersDriver = driver;
		welcomePage = new Welcome_Page(driver);
		loginPage = new Login_Page(driver);
		homePage = new Home_Page(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
	}

	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException {
		System.out.println("BeforeMethod");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));

		welcomePage.getLoginBtn().click();
		Thread.sleep(2000);

		loginPage.getEmailTF().sendKeys(file.readDataFromPropertyFile("username"));
		Thread.sleep(2000);
		loginPage.getPasswordTF().sendKeys(file.readDataFromPropertyFile("password"));
		loginPage.getLoginBtn().click();

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
		homePage.getAccountSetting().click();
		homePage.getLogout().click();
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("AfterClass");
		Thread.sleep(3000);
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
		report.flush();

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
