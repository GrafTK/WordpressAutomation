package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WordpressDBHelpFunct;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class DashboardHelpFunctioStepDefs {
WordpressDBHelpFunct DashboardFunctionality = new WordpressDBHelpFunct();
	
	WebDriver driver=Driver.getDriver();
	
	
	@When("^subscriber clicks on Dashboard$")
	public void subscriber_clicks_on_Dashboard() {
	   DashboardFunctionality.dashBoardButton.click();
	   
	}

	@Then("^Dashboard page should be loaded$")
	public void dashboard_page_should_be_loaded() {
	   assertTrue(BrowserUtils.verifyTitle(ConfigurationReader.getProperty("dashboardTitle")), "Title verification is failedx");
	}

	@When("^subscriber click on Help functionality$")
	public void subscriber_click_on_Help_functionality() {
	   DashboardFunctionality.helpButton.click();
	   
	}

	@Then("^the following options should be displayed in Help:$")
	public void the_following_options_should_be_displayed_in_Help(List <String> helpOptions) {
		
	  String[]expectedArr =ConfigurationReader.getProperty("helpOptions").split(",");
	  List<String>expectedList= Arrays.asList(expectedArr);
	  
	  System.out.println(expectedList);


	}

	@Then("^they all should be clickable$")
	public void they_all_should_be_clickable() {
	  
	  
	}

	@Then("^following links should be displayed under Help's For More Information:$")
	public void following_links_should_be_displayed_under_Help_s_For_More_Information(DataTable arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
	  
	}
	
	

}
