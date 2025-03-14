package testng;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RelativeLocatorDemo extends BaseClass{
	
	@Test
	public void realtiveLocatorDemo() throws InterruptedException
	{
		invokeBrowser("chrome");
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		//Relative locator above
		WebElement email = driver.findElement(with(By.tagName("input")).above(By.tagName("select")));
		Thread.sleep(2000);
		email.sendKeys("anand@dlogixconsulting.com");
		WebElement city = driver.findElement(with(By.tagName("input")).below(By.tagName("select")));
		Thread.sleep(2000);
		city.sendKeys("Bangalore");
	}

}
