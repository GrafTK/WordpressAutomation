package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WordpressAccountMenuPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AccountMenuOptionsStepDefinitions {
	
	WordpressAccountMenuPage accountMenuPage = new WordpressAccountMenuPage();
	
	WebDriver driver=Driver.getDriver();
	
	@Given("^subscriber is logged into Cybertek's Blog!$")
	public void subscriber_is_logged_into_Cybertek_s_Blog() {
		
	 driver.get(ConfigurationReader.getProperty("url"));
	 accountMenuPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
	accountMenuPage.loginPassword.sendKeys(ConfigurationReader.getProperty("password"));
	accountMenuPage.LogInButton.click();
	
	}

	@Given("^profile page is loaded$")
	public void profile_page_is_loaded() {
		
		  Assert.assertTrue(BrowserUtils.verifyUrl(ConfigurationReader.getProperty("homePageURL")),
				  "Url verification failed");
		  Assert.assertTrue(BrowserUtils.verifyTitle(ConfigurationReader.getProperty("profilePageTitle")), 
				  "Title verification failed");
	}

	@When("^subscriber hovers over account menu$")
	public void subscriber_hovers_over_account_menu() {
		
	  Actions action = new Actions(driver);
	  action.moveToElement(accountMenuPage.accountMenu).perform();
	
	}

	@Then("^the following menu options should be visible:$")
	public void the_following_menu_options_should_be_visible(List <String> menuOptions) {
		List <WebElement> actual= new ArrayList <WebElement> ();
		actual.add(BrowserUtils.waitForVisibility(By.xpath("//ul [@id='wp-admin-bar-user-actions']//a//span[@class='display-name']"), 2));
		actual.add(BrowserUtils.waitForVisibility(By.linkText("Edit My Profile"), 2));
		actual.add(BrowserUtils.waitForVisibility(By.linkText("Log Out"), 2));
		
	
		List <String > menuTextsActual= BrowserUtils.getElementsText(actual);
		String [] expected=ConfigurationReader.getProperty("hoverOverOptions").split(",");
		
		
		Assert.assertEquals(menuOptions, menuTextsActual, "Menu is not matching");	
	}

	@When("^subscriber clicks Edit My Profile$")
	public void subscriber_clicks_Edit_My_Profile() {
		(BrowserUtils.waitForVisibility(By.linkText("Edit My Profile"), 2)).click();
	}

	@Then("^the corresponding web page should be loaded$")
	public void the_corresponding_web_page_should_be_loaded() {
		  Assert.assertTrue(BrowserUtils.verifyTitle(ConfigurationReader.getProperty("profilePageTitle")), 
				  "Title verification failed");
	}

}
