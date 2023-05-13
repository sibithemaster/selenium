package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
( 
		features="src/test/java/features",
		glue="Cucumber.Stepdefination",
		tags="@SmokeTest or RegTest",
		stepNotifications=true,
		monochrome=true,
//	plugin= {"pretty",
//			"html:target/cucumber.html",
//			"json:target/cucumber.json",
//			"junit:target/cucumber.xml",
//			"pdf:target/cucumber.pdf"}
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunner {

}
