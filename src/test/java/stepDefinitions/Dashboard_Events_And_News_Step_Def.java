package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WordpressDashboardPage;
import page.WordpressHomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Dashboard_Events_And_News_Step_Def {

	WebDriver driver = Driver.getDriver();
	WordpressHomePage homePage = new WordpressHomePage();

	WordpressDashboardPage dashboardpage = new WordpressDashboardPage();

	@When("^subscriber clicks on Dashboard$")
	public void subscriber_clicks_on_Dashboard() {

		dashboardpage.dashboard.click();
	}

	@Then("^subscriber should be able to choose city$")
	public void subscriber_should_be_able_to_choose_city() {
		dashboardpage.city.click();
	}

	@Then("^receive events and news in that city$")
	public void receive_events_and_news_in_that_city() {

		Assert.assertTrue(dashboardpage.eventInfo.isDisplayed(), "Failed event validation");

	}

	@Then("^subscriber should be able to see Meetups and WordCamps$")
	public void subscriber_should_be_able_to_see_Meetups_and_WordCamps() {
		Assert.assertTrue(dashboardpage.meetup.isDisplayed(), "Meetups is not displayed");
		Assert.assertTrue(dashboardpage.wordCamps.isDisplayed(), "WordCamps is not displayed");
		
	}

}
