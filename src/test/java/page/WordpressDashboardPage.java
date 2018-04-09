package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class WordpressDashboardPage {
	private WebDriver driver;

	public WordpressDashboardPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="(//span[@class='display-name'])[1]")
public WebElement Howdy;


public void clickHowdy() {
	Actions act=new Actions(driver);
	act.moveToElement(Howdy).build().perform();
	
}

@FindBy(linkText="Log Out")
public WebElement logout;



}
