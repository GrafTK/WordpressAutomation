package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WordpressProfilePage {

private WebDriver driver;
	
	public WordpressProfilePage() {
		
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (linkText="Cybertek's Blog!")
	public WebElement cyberTekBlog;
	
	@FindBy (xpath="//ul[@id='wp-admin-bar-root-default']//a[text()='Visit Site']")
	public WebElement visitSiteLink;
	
	@FindBy(linkText="Dashboard")
	public WebElement dashboard;
	
	@FindBy(linkText="Graf TK")
	public WebElement userName;
	
	@FindBy(linkText="Edit My Profile")
	public WebElement editProfile;
	
	@FindBy(linkText="Log Out")
	public WebElement logout;
	
	@FindBy(xpath="(//a[@class='ab-item'])[10]")
	public WebElement howdy;
	
	public void navigateToHowdy() {
		Actions act = new Actions(driver);
		act.moveToElement(howdy).build().perform();
	}
	
}
