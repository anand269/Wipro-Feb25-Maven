package RediffPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPF {

	WebDriver driver;

	//Constructor with page factory
	public RediffLoginPF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);//initializing the elements
	}

	//@FindBy Annotation to find the elements
	@FindBy(name="login") WebElement userName;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(linkText="rediff.com") WebElement rediffHome;

	//user defined methods 
	public WebElement userName()
	{
		return userName;
	}

	//user defined methods 
	public WebElement password()
	{
		return password;
	}

	//user defined methods 
	public WebElement rediffHome()
	{
		return rediffHome;
	}
}
