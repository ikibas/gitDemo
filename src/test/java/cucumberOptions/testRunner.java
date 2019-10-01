package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
//@SuppressWarnings("deprecation")
@CucumberOptions(
		features="src/test/java/features",
		glue = "stepDefinition"
		//junit = "--step-notifications" // to show sub tests
		)


public class testRunner extends AbstractTestNGCucumberTests{

}
