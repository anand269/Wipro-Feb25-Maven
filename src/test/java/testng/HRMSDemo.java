package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HRMSDemo extends BaseClass{
	String name,password,url,browser;
	
	@BeforeTest	
	public void readData() throws IOException
	{
		//Added relative path to the file system
		//FileInputStream fis = new FileInputStream("D:\\Users\\Hp\\eclipse-workspace\\Wipro_Feb25_maven\\src\\test\\java\\data\\data.properties");
		FileInputStream fis = new FileInputStream("./src/test/java/data/data.properties");
		Properties prop = new Properties();
		prop.load(fis);//data.properties
		name = prop.getProperty("username");
		System.out.println(name);
		password = prop.getProperty("password");
		url = prop.getProperty("url");
		browser = prop.getProperty("browser");
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
	@Parameters({"browser"})
	public void login(String browser) throws IOException, InterruptedException
//	public void login() throws IOException, InterruptedException
	{
		invokeBrowser(browser);
		driver.get(url);
		Thread.sleep(3000);
		screenshot();
		//enter the user-id and password and enter
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//logout
		closeBrowser();
		
	}

}
