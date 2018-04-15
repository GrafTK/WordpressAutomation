package stepDefinitions;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.CybertekBlogsPage;
import page.WordpressHomePage;
import page.WordpressProfilePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Cybertek_Blog_Step_Def {

	WebDriver driver = Driver.getDriver();
	WordpressHomePage homePage = new WordpressHomePage();
	WordpressProfilePage profilePage = new WordpressProfilePage();
	CybertekBlogsPage cybertek=new CybertekBlogsPage();

	@Given("^subscriber is logged into Cybertek's Blog!$")
	public void subscriber_is_logged_into_Cybertek_s_Blog() {
		driver.get(ConfigurationReader.getProperty("url"));
		homePage.login.sendKeys(ConfigurationReader.getProperty("username"));
		homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
		homePage.loginButton.click();
		

	}

	@Given("^profile page is loaded$")
	public void profile_page_is_loaded() {
assertTrue(driver.getTitle().equals(ConfigurationReader.getProperty("profileTitle")),"profile title is wrong");
	}

	@When("^subscriber clicks on Cybertek's Blog!$")
	public void subscriber_clicks_on_Cybertek_s_Blog() {
		profilePage.cyberTekBlog.click();

	}

	@Then("^Cybertek's Blog home page should be displayed$")
	public void cybertek_s_Blog_home_page_should_be_displayed() {
		
		assertTrue(driver.getTitle().equals(ConfigurationReader.getProperty("cybertekBlogTitle")),
				"cybertek blog title is wrong");
	}

	@When("^subscriber hovers over Cybertek's Blog!$")
	public void subscriber_hovers_over_Cybertek_s_Blog() {
		Actions action=new Actions(driver);
		action.moveToElement(profilePage.cyberTekBlog).perform();
		BrowserUtils.waitFor(2);
		
		
		
		
		
	}

	@Then("^menu with only \"([^\"]*)\" option should be displayed$")
	public void menu_with_only_option_should_be_displayed(String option) {
		Assert.assertEquals(BrowserUtils.waitForVisibility(profilePage.visitSiteLink, 2).getText(), option, "Cybertek's Blog! menu option verification failed");
		
		
	    
	}

}
