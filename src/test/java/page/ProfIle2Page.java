package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ProfIle2Page {
	
	private WebDriver driver;
	public ProfIle2Page() {
		driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Profile2 feature files elements
	
	@FindBy(xpath="//tr[@class='user-first-name-wrap']")
	public WebElement fNameBox;
	
	@FindBy(xpath="//tr[@class='user-last-name-wrap']")
	public WebElement LNameBox;
	
	@FindBy(xpath="//tr[@class='user-nickname-wrap']")
	public WebElement nNameBox;
	
	@FindBy(xpath="//tr[@class='user-first-name-wrap']/td/input")
	public WebElement firstName;
	
	@FindBy(xpath="//tr[@class='user-last-name-wrap']/td/input")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='nickname']")
	public WebElement nickName;  
	
	@FindBy(xpath="//select[@id='display_name']/option[@selected='selected']")
	public WebElement defaultDropDownValue;
	
	@FindBy(xpath="//select[@id='display_name']")
	public WebElement displayName;
	
	@FindBy(xpath="//select[@id='display_name']")
	public WebElement dropDownOpt;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='url']")
	public WebElement website;
	
	@FindBy(xpath="//input[@id='submit']")
	public WebElement updateProfile;
	
	//Profile1 feature files elements
   
	@FindBy(xpath="//th[.='Admin Color Scheme']")
	public WebElement adminColorScheme;
	
	@FindBy(xpath="//label[.='Default']")
	public WebElement Default;
	
	
	@FindBy(xpath="//label[.='Ectoplasm']")
	public WebElement ectoplasmcolor;
	
	@FindBy(xpath="//label[.='Light']")
	public WebElement lightcolor;
	
	
	@FindBy(xpath="//label[.='Sunrise']")
	public WebElement sunrise;
	
	@FindBy(xpath="//label[.='Username']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@id='user_login']")
	public WebElement userNInputField;
	

}
