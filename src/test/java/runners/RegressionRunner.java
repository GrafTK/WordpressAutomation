package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty" ,"html:target/cucumber" ,"json:target/json"} ,
		features="src/test/resources/features" ,
		glue="stepDefinitions" ,
		tags="@regression" ,
		dryRun=false
		
		)
public class RegressionRunner extends AbstractTestNGCucumberTests{

}
