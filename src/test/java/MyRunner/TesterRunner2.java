package MyRunner;

//import org.junit.runner.RunWith;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
	features="D:\\Users\\Hp\\eclipse-workspace\\Wipro_Feb25_maven\\src\\test\\java\\feature\\tester.feature",
	glue="stepDef", plugin= {"pretty"},monochrome=true)

public class TesterRunner2 extends AbstractTestNGCucumberTests{
	
}
