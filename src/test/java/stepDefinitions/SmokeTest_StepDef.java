package stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WordpressHomePage;
import page.WordpressProfilePage;
import utilities.Driver;

public class SmokeTest_StepDef {
	
	WebDriver driver = Driver.getDriver();
	WordpressHomePage homePage = new WordpressHomePage();
	WordpressProfilePage profilePage = new WordpressProfilePage();
	
	@When("^subscriber clicks again on Cybertek's Blog!$")
	public void subscriber_clicks_again_on_Cybertek_s_Blog() {
	    
	}

	@Then("^Dashboard page should be loaded$")
	public void dashboard_page_should_be_loaded() {
	   
	}

	@Then("^subscriber logs out$")
	public void subscriber_logs_out() {
	    
	}


}
