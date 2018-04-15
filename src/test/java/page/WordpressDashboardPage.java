package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class WordpressDashboardPage {

	
private WebDriver driver;
	
	public WordpressDashboardPage() {
		driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="(//span[@class='display-name'])[1]")
public WebElement Howdy;


	@FindBy(xpath = "(//span[@class='display-name'])[1]")
	public WebElement Howdy;

	public void clickHowdy() {
		Actions act = new Actions(driver);
		act.moveToElement(Howdy).build().perform();

	}


	@FindBy(linkText = "Log Out")
	public WebElement logout;

	@FindBy(xpath = "(//*[text()='Dashboard'])")
	public WebElement dashboard;

	@FindBy(xpath = "(//*[text()='WordPress Gutenberg Demo and Talk'])")
	public WebElement city;

	@FindBy(xpath = "//section[@class='section text--small']")
	public WebElement eventInfo;

	@FindBy(xpath="//p[@class='community-events-footer']//a[1]")
	public WebElement meetup;

	@FindBy(xpath = "(//span[.='Groups'])")
	public WebElement groups;

	
	@FindBy(xpath="//p[@class='community-events-footer']//a[2]")
	public WebElement wordCamps;

@FindBy(xpath="//h3[.='Recently Published']")
public WebElement recentPublishes;

@FindBy(linkText="slay")
public WebElement postSlay;

@FindBy(xpath="(//span[@class='ab-icon'])[2]")
public WebElement wordpressLogo;

@FindBy(linkText="WordPress.org")
public WebElement wordpresslink;

@FindBy(linkText="Documentation")
public WebElement documentation;

@FindBy(linkText="About WordPress")
public WebElement aboutWordpress;
public void logoOptions(WebElement element) {
	Actions action=new Actions(driver);
	action.moveToElement(wordpressLogo).build().perform();
element.click();
}
@FindBy(xpath="(//*[text()='Dashboard'])")
public WebElement dashboard;

@FindBy(xpath="(//*[text()='WordPress Gutenberg Demo and Talk'])")
public WebElement city;

@FindBy (xpath="//section[@class='section text--small']")
public WebElement eventInfo;


@FindBy (xpath="(//span[.='Groups'])")
public WebElement groups;

@FindBy (css=".community-events-footer a")
public List<WebElement> worldCamps;




}

