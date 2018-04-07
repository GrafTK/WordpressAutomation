package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class WordpressHomePage {
	private WebDriver driver;
	
	public WordpressHomePage() {
		driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="user_login")
	public WebElement login;
	
	@FindBy (id="user_pass")
	public WebElement password;
	
	@FindBy (id="wp-submit")
	public WebElement loginButton;

	
	public void loginIntoAccount(String userName, String pwd) {
		login.sendKeys(userName);
		password.sendKeys(pwd);
		loginButton.click();
	}

}
