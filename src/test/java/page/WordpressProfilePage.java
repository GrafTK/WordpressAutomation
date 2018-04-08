package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
}
