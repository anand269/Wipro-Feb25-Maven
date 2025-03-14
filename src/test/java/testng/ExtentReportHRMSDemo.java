package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportHRMSDemo extends BaseClass{
	String name,password,url,browser;
	public static ExtentReports extent;
    public static ExtentTest test;
    private ExtentSparkReporter spark;
	
    @BeforeTest
	public void readData() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Users\\Hp\\eclipse-workspace\\Wipro_Feb25_maven\\src\\test\\java\\data\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);//data.properties
		name = prop.getProperty("username");
		password = prop.getProperty("password");
		url = prop.getProperty("url");
		browser = prop.getProperty("browser");
		// Initialize ExtentReports and attach the reporter
        spark = new ExtentSparkReporter("./target/ExtentReports-HRMS.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        System.out.println("setup method executed");
		
	}
	
	@Test
	public void data()
	{
		System.out.println(name);
		System.out.println(password);
		System.out.println(url);
		System.out.println(browser);
	}
	
	@Test (enabled=true)
	//@Parameters({"browser"})
	public void login() throws IOException, InterruptedException
	{
		invokeBrowser(browser);
		test = extent.createTest("HRMS login page");//crating an extent step in html
		driver.get(url);
		test.log(Status.INFO, "Navigated to HRMS login page");
		Thread.sleep(3000);
		screenshot();
		test.log(Status.INFO, "Taken the screen shot");
		//enter the user-id and password and enter
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test.log(Status.INFO, "Logged in successfully");
		//logout
		extent.flush();
		closeBrowser();		
	}

}
