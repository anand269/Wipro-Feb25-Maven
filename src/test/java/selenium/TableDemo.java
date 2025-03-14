package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableDemo extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
		//Logic to capture the total no of columns in the above table
		List<WebElement> headers = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th"));
		System.out.println("Total no of headers/columns: "+headers.size());//5
		
		//Print all the header values
		
		//Find the total no of rows(tbody) in the table & print the values
		
		//find any one cell within the table and print the value
		
		
	}

}
