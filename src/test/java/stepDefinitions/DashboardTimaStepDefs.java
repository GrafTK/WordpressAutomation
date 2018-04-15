package stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.CybertekBlogsPage;
import page.WordpressDashboardPage;
import page.WordpressHomePage;
import page.WordpressProfilePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class DashboardTimaStepDefs {
	
	WebDriver driver = Driver.getDriver();
	WordpressHomePage homePage = new WordpressHomePage();
	WordpressProfilePage profilePage = new WordpressProfilePage();
CybertekBlogsPage cybertek=new CybertekBlogsPage();
	WordpressDashboardPage dashboard=new WordpressDashboardPage();
	
	
	
	@When("^subscriber clicks on Dashboard$")
	public void subscriber_clicks_on_Dashboard() {
	  profilePage.dashboard.click();
	}

	@Then("^subscriber should be able to read the documentation$")
	public void subscriber_should_be_able_to_read_the_documentation() {
	BrowserUtils.waitFor(3);
	 dashboard.logoOptions(dashboard.documentation);
	 assertTrue(driver.getCurrentUrl().equals(ConfigurationReader.getProperty("documentationUrl")));
	}
	@Then("^subscriber goes back to dashboard page$")
	public void subscriber_goes_back_to_dashboard_page() {
	   driver.navigate().back();
	   String expected="Dashboard ‹ Cybertek's Blog! — WordPress";
	   assertTrue(driver.getTitle().equals(expected),"title is wrong");
	}


	@Then("^subscriber should be able to go to wordpress official page$")
	public void subscriber_should_be_able_to_go_to_wordpress_official_page() {
	    dashboard.logoOptions(dashboard.wordpresslink);
	}
}
