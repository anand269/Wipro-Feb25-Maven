package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP
{
    @DataProvider (name = "dataprovider")
     public Object[][] dpMethod(){
	 return new Object[][] {{"Wipro"},{"Infosys"},{"TCS"}};
     }
	
    @Test (dataProvider = "dataprovider")
    public void myTest (String val) {
        System.out.println("Passed Parameter Is : " + val);
    }
}