package stepDefinitions;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WordpressDBHelpFunct;
import utilities.ConfigurationReader;
import utilities.Driver;

public class DashboardHelpFunctioStepDefs {
	WordpressDBHelpFunct dashboardFunctionality = new WordpressDBHelpFunct();
	
	WebDriver driver=Driver.getDriver();
	
	


	@When("^subscriber click on Help functionality$")
	public void subscriber_click_on_Help_functionality() {
	   dashboardFunctionality.helpButton.click();
	   
	}

	@Then("^the following options should be displayed in Help:$")
	public void the_following_options_should_be_displayed_in_Help(List <String> helpOptions) {
		
	  String[]expectedArr =ConfigurationReader.getProperty("helpOptions").split(",");
	  List<String>expectedList= Arrays.asList(expectedArr);
	  Assert.assertEquals(expectedList, helpOptions, "Help options are not matching");
	}

	@Then("^they all should be clickable$")
	public void they_all_should_be_clickable() {
		
		for (WebElement each:dashboardFunctionality.helpFunctionalityOptions) {
			each.isEnabled();
		}
		
	  
	}

	@Then("^following links should be displayed under Help's For More Information:$")
	public void following_links_should_be_displayed_under_Help_s_For_More_Information(List <String> helpOptions) {
	    
	  
	}
	
	

}
