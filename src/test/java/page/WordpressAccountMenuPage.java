package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;


public class WordpressAccountMenuPage {
private WebDriver driver;
	
	public WordpressAccountMenuPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText ="Howdy, ")
	public WebElement accountMenu;  
	
	@FindBy(xpath="//ul [@id='wp-admin-bar-user-actions']//a")
	public List <WebElement> accountMenuHoverOverOptions;
	
	@FindBy(xpath="//ul [@id='wp-admin-bar-user-actions']//a//span[@class='display-name']")
	public WebElement grafTK;
	
	@FindBy(linkText="Edit My Profile")
	public WebElement editMyProfileLink;
	
	@FindBy(linkText= "Log Out")
	public WebElement logOutLink;
	
	
	@FindBy(id="user_login")
	public WebElement userName;
	
	@FindBy(id = "user_pass")
	public WebElement loginPassword;
	
	@FindBy(id = "wp-submit")
	public WebElement LogInButton;
	
	
}
