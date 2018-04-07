package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WordpressHomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Commenting_Step_Def {

	WebDriver driver=Driver.getDriver();
	WordpressHomePage homePage= new WordpressHomePage();

	@Given("^subscriber is logged into Cybertek's Blog!$")
	public void subscriber_is_logged_into_Cybertek_s_Blog() {
		
		driver.get(ConfigurationReader.getProperty("url"));
		homePage.loginIntoAccount(ConfigurationReader.getProperty("username"), 
				ConfigurationReader.getProperty("password"));
		

	}

	@Given("^profile page is loaded$")
	public void profile_page_is_loaded() {
		
		String expectedTitle="Profile ‹ Cybertek's Blog! — WordPress";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Profile page title verification failed");

	}

	@When("^subscriber clicks on Cybertek's Blog!$")
	public void subscriber_clicks_on_Cybertek_s_Blog() {

	}

	@Then("^Cybertek's Blog home page should be displayed$")
	public void cybertek_s_Blog_home_page_should_be_displayed() {

	}

	@When("^subscriber clicks on \"([^\"]*)\"$")
	public void subscriber_clicks_on(String arg1) {

	}

	@Then("^subscriber should be able to post a (.*)$")
	public void subscriber_should_be_able_to_post_a(String arg1) {

	}

	@Then("^subscriber should be able to (.*) to (.*)$")
	public void subscriber_should_be_able_to_to(String arg1, String arg2) {

	}

}
