package stepDefinitions;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.ProfIle2Page;
import page.WordpressHomePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Profile2StepDefs {
	
	WebDriver driver=Driver.getDriver();
	ProfIle2Page profPage = new ProfIle2Page();
	
	//Profile2 feature files elements
	@Given("^First Name, Last Name, Nickname input fields$")
	public void first_Name_Last_Name_Nickname_input_fields() {
		BrowserUtils.waitFor(3);
		assertTrue(profPage.fNameBox.getText().equals("First Name"));
		assertTrue(profPage.LNameBox.getText().equals("Last Name"));
		assertTrue(profPage.nNameBox.getText().contains("Nickname"));
	}

	@Then("^subscriber should able to see First Name,Last Name and Nick Name info$")
	public void subscriber_should_able_to_see_First_Name_Last_Name_and_Nick_Name_info() {
		BrowserUtils.waitFor(3);
		assertTrue(profPage.firstName.getAttribute("value").equals("Graf"));
        assertTrue(profPage.lastName.getAttribute("value").equals("TK"));
        assertTrue(profPage.nickName.getAttribute("value").equals("Graf"));
	}
	@Then("^Default choosen name should be displayed$")
	public void default_choosen_name_should_be_displayed() {
		BrowserUtils.waitFor(3);
		assertTrue(profPage.defaultDropDownValue.getText().equals("Graf"));
	}

	@Then("^subscriber should be able to click on  display name Publicly as to change name$")
	public void subscriber_should_be_able_to_click_on_display_name_Publicly_as_to_change_name() {
		BrowserUtils.waitFor(3);
		Select ss = new Select( profPage.dropDownOpt);
		
		ss.selectByVisibleText("Graf");
		BrowserUtils.waitFor(3);
		
	}
	
	@When("^subscriber click on email required input field$")
	public void subscriber_click_on_email_required_input_field() {
		profPage.email.clear(); 
		  BrowserUtils.waitFor(3);
		  
	}

	
	@Then("^subscriber should be able to change an email address$")
	public void subscriber_should_be_able_to_change_an_email_address() {
	   profPage.email.sendKeys("nurakbarca10@gmail.com");
	   BrowserUtils.waitFor(3);
	}


	@When("^subscriber click on Website input field$")
	public void subscriber_click_on_Website_input_field() {
		profPage.website.clear();
	 profPage.website.click();
	}

	@Then("^subscriber should be able to insert a Website address$")
	public void subscriber_should_be_able_to_insert_a_Website_address() {
	   profPage.website.sendKeys("cybertekschool.com");
	   BrowserUtils.waitFor(3);
	}

	@When("^subscriber should click on Update Profile$")
	public void subscriber_should_click_on_Update_Profile() {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	   profPage.updateProfile.click();
	   BrowserUtils.waitFor(3);
	}

	@Then("^updated profile page should be displayed$")
	public void updated_profile_page_should_be_displayed() {
	    assertTrue(driver.getTitle().equals(ConfigurationReader.getProperty("profilePageTitle")));
	}
	
	//Profile1 feature files elements
	
	@Given("^Admin Color Scheme options$")
	public void admin_Color_Scheme_options() {
		BrowserUtils.waitFor(3);
	    assertTrue(driver.getTitle().equals(ConfigurationReader.getProperty("profilePageTitle")));
	    assertTrue(profPage.adminColorScheme.isDisplayed(),"admin color scheme is not displayed");
	}

	@When("^Subscriber should be able to choose any scheme color option$")
	public void subscriber_should_be_able_to_choose_any_scheme_color_option() {
	    BrowserUtils.waitFor(3);
		profPage.lightcolor.click();
	}

	@Then("^background have to change to that subscriber choosen color$")
	public void background_have_to_change_to_that_subscriber_choosen_color() {
	   BrowserUtils.waitFor(3);
		//assertTrue(profPage.lightcolor.isSelected(),"light color is not selected");
	}
	
	@Given("^Username input field$")
	public void username_input_field() {
	   assertTrue(profPage.userName.isDisplayed(), "User name is not displayed");
	}

	@Given("^subscriber would not be able to click on it$")
	public void subscriber_would_not_be_able_to_click_on_it() {
	   
	   Assert.assertFalse(profPage.userNInputField.isSelected(), "It is clickable");
	}

	@Given("^Username input field is Graf$")
	public void username_input_field_is_Graf() {
	   assertTrue(profPage.userNInputField.getAttribute("value").equals("Graf"));
	}
}
