package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin="html:target/cucumber" ,
		features="src/test/resources/features" ,
		glue="stepDefinitions" ,
		tags="@dev" ,
		dryRun=false
		
		)
public class CukesRunner extends AbstractTestNGCucumberTests {

}
