package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WordpressHomePage;
import page.WordpressProfilePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class ProfileHelpFunctionality {

	WebDriver driver= Driver.getDriver();
	WordpressHomePage homePage= new WordpressHomePage();	
	WordpressProfilePage profilePage= new WordpressProfilePage();
	List <WebElement> elements;
	@When("^subscriber clicks on Help Functionality$")
	public void subscriber_clicks_on_Help_Functionality() {
	    // Write code here that turns the phrase above into concrete actions
	    
		profilePage.helpButton.click();
		
	}

	@Then("^following links should be displayed under For More Information:$")
	public void following_links_should_be_displayed_under_For_More_Information(List <String> helpLinks) {
	   
	   elements = new ArrayList<>();
	    
	      elements.add(profilePage.documentationOnUserProfile);
	      elements.add(profilePage.supportFormsLink);
	      
	     List<String> actual=BrowserUtils.getElementsText(elements);
	    
	     Assert.assertEquals(actual, helpLinks, "Links are not matching");
	     Assert.assertTrue(profilePage.documentationOnUserProfile.isDisplayed(), "Documentation link is not displayed");
	     Assert.assertTrue(profilePage.supportFormsLink.isDisplayed(), "Supports link is not displayed");
	    // elements.get(0).click();
	     

	}



		@When("^clicks on (.*) and web page should be displayed$")
		public void clicks_on_and_web_page_should_be_displayed(String linkText) {
		    

		    elements = new ArrayList<>();
		    
		      elements.add(profilePage.documentationOnUserProfile);
		      elements.add(profilePage.supportFormsLink);
			for (WebElement each: elements) {
				if (each.getText().equals(linkText)) {
					each.click();
				}

			}
	}


}
