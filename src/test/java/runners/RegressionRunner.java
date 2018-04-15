package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty" ,"html:target/cucumber" ,"json:target/json"} ,
		features="src/test/resources/features" ,
		glue="stepDefinitions" ,
		tags="@account,@account2,@cybertekblog,@cybertekblog2,@meetups,@meetups2,@dashboardHelp,@dashboardHelp2,@smoketest,@dashboard,@dashboard2" ,
		dryRun=false
		
		)
public class RegressionRunner extends AbstractTestNGCucumberTests{

}
