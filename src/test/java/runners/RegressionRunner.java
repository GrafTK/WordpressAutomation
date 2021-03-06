package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"} ,
		features="src/test/resources/features" ,
		glue="stepDefinitions" ,
		tags="@account,@cybertekblog,@meetups,@worldcamps,@dashboardHelp,@dashboard,@Prof1,@Prof2,@notes,@PHelp,@smoketest" ,
		dryRun=false
		
		)
public class RegressionRunner extends AbstractTestNGCucumberTests{

}
