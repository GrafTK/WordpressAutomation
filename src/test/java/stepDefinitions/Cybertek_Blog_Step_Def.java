package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WordpressHomePage;
import page.WordpressProfilePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Cybertek_Blog_Step_Def {

	WebDriver driver = Driver.getDriver();
	WordpressHomePage homePage = new WordpressHomePage();
	WordpressProfilePage profilePage = new WordpressProfilePage();


	@Given("^subscriber is logged into Cybertek's Blog!$")
	public void subscriber_is_logged_into_Cybertek_s_Blog() {

		driver.get(ConfigurationReader.getProperty("url"));
		homePage.loginIntoAccount(ConfigurationReader.getProperty("username"),
				ConfigurationReader.getProperty("password"));

	}

	@Given("^profile page is loaded$")
	public void profile_page_is_loaded() {

		String expectedTitle = "Profile ‹ Cybertek's Blog! — WordPress";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Profile page title verification failed");

	}

	@When("^subscriber clicks on Cybertek's Blog!$")
	public void subscriber_clicks_on_Cybertek_s_Blog() {
		profilePage.cyberTekBlog.click();

	}

	@Then("^Cybertek's Blog home page should be displayed$")
	public void cybertek_s_Blog_home_page_should_be_displayed() {
		
		String expectedTitleHome = "Cybertek's Blog! – DisCoVer !!!";
		String actualTitleHome = driver.getTitle();
		Assert.assertEquals(actualTitleHome, expectedTitleHome, "HomePage title verification failed");
		
	}

	@When("^subscriber hovers over Cybertek's Blog!$")
	public void subscriber_hovers_over_Cybertek_s_Blog() {
		
		BrowserUtils.hover(profilePage.cyberTekBlog);
		
	}

	@Then("^menu with only \"([^\"]*)\" option should be displayed$")
	public void menu_with_only_option_should_be_displayed(String option) {
		
		
		Assert.assertEquals(BrowserUtils.waitForVisibility(profilePage.visitSiteLink, 2).getText(), option, "Cybertek's Blog! menu option verification failed");
	    
	}

}
