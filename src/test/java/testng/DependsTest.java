package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTestNG.class)
public class DependsTest {
	WebDriver driver;
	@Test (dependsOnMethods = {"openBrowser"}) //(priority=1)
	public void AsignIn() throws InterruptedException
	{
		System.out.println("Sign in page...");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		/*
		 * Thread.sleep(2000); driver.close();
		 */
	}
	
	@Test //(priority=0)
	public void openBrowser()
	{
		System.out.println("Open browser will execute first");
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test (dependsOnMethods = {"AsignIn"})
	public void viewDashBoard()
	{
		System.out.println("View your dashBoard");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	/*
	 * @AfterTest public void closeBrowser() throws InterruptedException {
	 * Thread.sleep(2000); driver.close(); }
	 */

}
