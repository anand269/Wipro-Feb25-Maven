package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="D:\\Users\\Hp\\eclipse-workspace\\Wipro_Feb25_maven\\src\\test\\java\\feature\\tester.feature",
	glue="stepDef", plugin= {"pretty"},monochrome=true, tags="@regression or @smoke")

public class TesterRunner {
	
}
