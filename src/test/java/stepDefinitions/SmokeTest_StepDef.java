package stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.CybertekBlogsPage;
import page.WordpressDashboardPage;
import page.WordpressHomePage;
import page.WordpressProfilePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SmokeTest_StepDef {
	
	WebDriver driver = Driver.getDriver();
	WordpressHomePage homePage = new WordpressHomePage();
	WordpressProfilePage profilePage = new WordpressProfilePage();
	CybertekBlogsPage cybertek=new CybertekBlogsPage();
	WordpressDashboardPage dashboard=new WordpressDashboardPage();
	
	
	@When("^subscriber clicks again on Cybertek's Blog!$")
	public void subscriber_clicks_again_on_Cybertek_s_Blog() {
	 cybertek.clickCybertekBlog();
	
	
	
	}

	@Then("^Dashboard page should be loaded$")
	public void dashboard_page_should_be_loaded() {
	 profilePage.dashboard.click();
		assertTrue(driver.getTitle().equals(ConfigurationReader.getProperty("dashboardtitle")));
	}

	@Then("^subscriber logs out$")
	public void subscriber_logs_out() {
		BrowserUtils.waitFor(2);
	    dashboard.clickHowdy();
	    dashboard.logout.click();
	}


}
