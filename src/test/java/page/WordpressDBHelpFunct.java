package page;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WordpressDBHelpFunct {
private WebDriver driver;
	
	public WordpressDBHelpFunct() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver,  this);
	}
	
	@FindBy(xpath="(//div[@class='wp-menu-name'])[1]")
	public WebElement dashBoardButton; 
	
	@FindBy(id="contextual-help-link")
	public WebElement helpButton; 
	
	@FindBy(xpath="//div[@class='contextual-help-tabs']//a")
	public  List <WebElement> helpFunctionalityOptions;
	
	@FindBy(linkText="Documentation on User Profiles")
	public WebElement documentationUserProfLink;
	
	@FindBy(linkText="Support Forums")
	public WebElement supportForumsLink;

}
