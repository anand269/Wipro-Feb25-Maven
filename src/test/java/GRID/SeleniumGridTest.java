package GRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridTest {
	
	@Test (enabled=false)
	public void GRIDTest() throws MalformedURLException
	{
		ChromeOptions options = new ChromeOptions();

        // Connect to the Selenium Grid Hub
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);

        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());

	}
	
	@Test
	public void GRIDTest2() throws MalformedURLException
	{
		FirefoxOptions options = new FirefoxOptions();
		
        // Connect to the Selenium Grid Hub
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);

        driver.get("https://www.rediff.com/");
        System.out.println("Title: " + driver.getTitle());

	}
	
	@Test (enabled=false)
	public void GRIDTest3() throws MalformedURLException
	{
		EdgeOptions options = new EdgeOptions();

        // Connect to the Selenium Grid Hub
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);

        driver.get("https://www.amazon.in/");
        System.out.println("Title: " + driver.getTitle());

	}

}
