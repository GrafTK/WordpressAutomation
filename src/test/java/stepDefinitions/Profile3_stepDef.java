package stepDefinitions;

    import static org.testng.Assert.assertTrue;
	import org.apache.poi.hssf.record.BiffHeaderInput;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import page.WordpressHomePage;
	import utilities.BrowserUtils;
	import utilities.Driver;

public class Profile3_stepDef {

		
		WebDriver driver= Driver.getDriver();
		WordpressHomePage homePage= new WordpressHomePage();	
	

		@Given("^Biographycal Info Checkbox$")
		public void biographycal_Info_Checkbox() {
			
		   if(homePage.bioInfo.isDisplayed()) 
			   System.out.println("BioInfo is there : ");
		 

		}

		@When("^subscriber to able click on Biographycal Info Checkbox checkbox$")
		public void subscriber_to_able_click_on_Biographycal_Info_Checkbox_checkbox() {
		
			homePage.bioInfo.click();
			homePage.textarea.clear();
			
		}

		@Then("^subscriber able to type some information$")
		public void subscriber_able_to_type_some_information() {
			
			homePage.textarea.sendKeys("i have 5 years experience in IT");
			
		}

		@Given("^Profile Picture Gravatar$")
		public void profile_Picture_Gravatar() {
		   
			if(homePage.ProfPictureText.isDisplayed()) {
				System.out.println("It is Displayed");
			}

		}

		@When("^subscriber able to click on Gravatar$")
		public void subscriber_able_to_click_on_Gravatar() throws InterruptedException {
		   String curURL = driver.getCurrentUrl();
		   homePage.Gravatar.click();
			Assert.assertFalse(curURL.equals(driver.getCurrentUrl()));
			BrowserUtils.waitForPageToLoad(4);
			Thread.sleep(3000);
		
			driver.navigate().back();
		 
		}

		@Then("^subscriber able to see and change own profile picture$")
		public void subscriber_able_to_see_and_change_own_profile_picture() {
		    
			Assert.assertTrue(homePage.gravatarPicture.isDisplayed());
			
		}

		@Given("^New Password button$")
		public void new_Password_button() {
		   
			Assert.assertTrue(homePage.newPasswordText.isDisplayed());
			
		}

		@When("^subscriber clicks on Generate Password button$")
		public void subscriber_clicks_on_Generate_Password_button() {
		 
			homePage.generPasswd.click();
		
		}

		@Then("^subscriber able Change and Hide password$")
		public void subscriber_able_Change_and_Hide_password() {
			
		}

		@Given("^Sessions button$")
		public void sessions_button() {
		    
			Assert.assertTrue(homePage.sessionsText.isDisplayed());
			
		}

		@When("^subscriber clicks on Log Out Everwhere else button$")
		public void subscriber_clicks_on_Log_Out_Everwhere_else_button() {
		    WebDriverWait wait = new WebDriverWait(driver, 5);
		    wait.until(ExpectedConditions.elementToBeClickable(homePage.logOuteEverywhereButton));
			homePage.logOuteEverywhereButton.click();
			homePage.logOuteEverywhereButton.click();
			
		}

		@Then("^subsriber able to logout from webPage$")
		public void subsriber_able_to_logout_from_webPage() {
		assertTrue(homePage.logOuteEverywhereButton.isDisplayed());
			
			
	}

}
