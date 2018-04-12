package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class WordpressDashboardPage {
	
private WebDriver driver;
	
	public WordpressDashboardPage() {
		driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//*[text()='Dashboard'])")
	public WebElement dashboard;
	
	@FindBy(xpath="(//*[text()='WordPress Gutenberg Demo and Talk'])")
	public WebElement city;
	
	@FindBy (xpath="//section[@class='section text--small']")
	public WebElement eventInfo;
	
	@FindBy (xpath="(//h4[.='Meetup'])")
	public WebElement meetup;
	
	@FindBy (xpath="(//span[.='Groups'])")
	public WebElement groups;
	
	@FindBy (css=".community-events-footer a")
	public List<WebElement> worldCamps;
}

