package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod //supporting annotation which is used to initialize 
	@Parameters({"browser"})
	public void openBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();	//opening the browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();	//opening the browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.manage().window().maximize();
		}
		else
			System.out.println("Browser not matching");
	}
	
	@Test
	public void googleDemo()
	{
					
		driver.get("https://www.google.com/");//Enter the URL
		String title = driver.getTitle();//To capture the title of the page
		System.out.println(driver.getTitle());//validation
		//validation search is displayed or not enabled or not
		//identify the object - use locators
		WebElement searchBox = driver.findElement(By.name("q"));
		//validation search is displayed or not enabled or not
		driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("automation");//type the word
		searchBox.sendKeys(Keys.ENTER);//hit enter btn
		//searchBox.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);//to select India
		//validation of the page title
		
	}
	
	@Test (enabled=false)
	public void orangeDemo()
	{
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
