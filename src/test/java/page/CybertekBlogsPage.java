package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class CybertekBlogsPage {
private WebDriver driver;
public CybertekBlogsPage() {
	this.driver=Driver.getDriver();
	PageFactory.initElements(driver, this);
}
//public void clickCybertekBlog() {
//	Actions act=new Actions(driver);
//	act.moveToElement(driver.findElement(By.xpath("//li[@id='wp-admin-bar-site-name']/a"))).build().perform();;
//	driver.findElement(By.xpath("//a[.='Visit Site']")).click();
//	act.moveToElement(driver.findElement(By.xpath("//li[@id='wp-admin-bar-site-name']/a"))).build().perform();;
//	BrowserUtils.waitFor(3);
//	driver.findElement(By.xpath("//a[.='Dashboard']")).click();
//}
@FindBy(xpath="(//li[@id='wp-admin-bar-site-name']//a)[1]")
public WebElement cybertekBl;




public void clickCybertekBlog() {
	Actions act=new Actions(driver);
	act.moveToElement(cybertekBl).click().build().perform();
	
}


}
