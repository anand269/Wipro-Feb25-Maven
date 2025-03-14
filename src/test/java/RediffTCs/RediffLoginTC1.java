package RediffTCs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import RediffPages.RediffHomePage;
import RediffPages.RediffLoginPF;
import RediffPages.RediffLoginPage;

public class RediffLoginTC1 {
	
	//Declare the webdriver
	WebDriver driver;
	RediffHomePage rhp;
	RediffLoginPage rlp;
	RediffLoginPF rlpf;
	 
	 @Test (enabled=false)
	 public void rediffTC1() throws InterruptedException
	 {
		 driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 rlp=new RediffLoginPage(driver);
		 rlp.userName().sendKeys("admin");
		 rlp.password().sendKeys("admin123");
		 
		 //home page navigate
		 rlp.rediffHome().click();//Home page of Rediff 
		 rhp = new RediffHomePage(driver);
		 Thread.sleep(2000);//use explict wait before you click
		 rhp.news().click();
		 Thread.sleep(2000);
		 rhp.movie().click();
	 }
	 
	 @Test
	 public void rediffPF() throws InterruptedException
	 {
		 driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 rlpf=new RediffLoginPF(driver);
		 rlpf.userName().sendKeys("admin");
		 rlpf.password().sendKeys("admin123");
		 
		 //home page navigate
		 rlpf.rediffHome().click();//Home page of Rediff 
		 rhp = new RediffHomePage(driver);
		 Thread.sleep(2000);//use explict wait before you click
		 rhp.news().click();
		 Thread.sleep(2000);
		 rhp.movie().click();
	 }

}
