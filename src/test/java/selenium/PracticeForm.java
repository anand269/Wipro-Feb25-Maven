package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class PracticeForm  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("edge");
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("max");
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver; js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("uploadPicture")).sendKeys("D:\\Automation\\Automation-Objective.txt");
	}

}
