package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Then;
import page.WordpressDashboardPage;

public class Dashboard_WorldCamps_News_Step_Def {
	
	@Then("^subscriber should be able to see upcoming WorldCamps$")
	public void subscriber_should_be_able_to_see_upcoming_WorldCamps() {
		WordpressDashboardPage dashboard = new WordpressDashboardPage();
	    SoftAssert soft  = new SoftAssert();
	    for(WebElement elem : dashboard.worldCamps){
	    	soft.assertTrue(elem.isDisplayed(), "WorldCamp verification failed");
	    	
	    }
	    soft.assertAll();
	}

	@Then("^subscriber should be able to see news$")
	public void subscriber_should_be_able_to_see_news() {
		subscriber_should_be_able_to_see_upcoming_WorldCamps();
		
	}

}
