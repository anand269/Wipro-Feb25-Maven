package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="D:\\Users\\Hp\\eclipse-workspace\\Wipro_Feb25_maven\\src\\test\\java\\feature\\HRMLogin.feature",
	glue="stepDef", plugin= {"pretty"},monochrome=true)

public class HRMRunner {
	
}
