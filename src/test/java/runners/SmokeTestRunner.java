package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"} ,
		features="src/test/resources/features" ,
		glue="stepDefinitions" ,
		tags="@smoketest" ,
		dryRun=false
		
		)
public class SmokeTestRunner extends AbstractTestNGCucumberTests {

}
