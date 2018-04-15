package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowserUtils;
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
	
	
	
	@FindBy(id = "user_pass")
	public WebElement passwd;

	
	
	
	
	@FindBy(xpath = "//label[@for='description']")
	public WebElement bioInfo;
	
	@FindBy(id = "description")
	public WebElement textarea;
	
	
	
	
	@FindBy(xpath = "//tr[@class='user-profile-picture']")
	public WebElement ProfPictureText;
	
	@FindBy(xpath = "//a[@href='https://en.gravatar.com/']")
	public WebElement Gravatar;
	
	
	
	@FindBy(xpath = "//button[@type='button']")
	public WebElement generPasswd;
	
	
	@FindBy(xpath = "//th[.='Sessions']")
	public WebElement sessionsText;
	
	
	@FindBy(xpath = "//label[@for='pass1-text']")
	public WebElement newPasswordText;
	
	@FindBy(xpath = "//img[@class='avatar avatar-96 photo']")
	public WebElement gravatarPicture;
	
	
	
	//@FindBy(xpath = "//button[@id='destroy-sessions']")
	@FindBy(xpath = "//button[contains(text(), 'Log Out Everywhere Else')]")
	public WebElement logOuteEverywhereButton;
	
	@FindBy(xpath = "//div[.='You are now logged out everywhere else.']")
	public WebElement YouAreNowLoggedText;


	



}


