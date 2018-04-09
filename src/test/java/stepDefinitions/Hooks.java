package stepDefinitions;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Driver;

public class Hooks {
	@Before
	public void setup(Scenario scenario ) {
		WebDriver driver=Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Before scenario");
	}
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("After scenario");
		if(scenario.isFailed()) {
		final byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
		
	}
		
		//Driver.closeDriver();
}
}