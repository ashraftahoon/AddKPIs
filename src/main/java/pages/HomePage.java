package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

	
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}


	private By generalsettinglink= By.xpath("//i[@class='nav-icon icon-settings ng-star-inserted']");
	//private By generalsettinglink= By.xpath("//a[@class='nav-link ng-star-inserted active']");
	
	public  GeneralSettingPage   clickOnHompageSetting()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(generalsettinglink).click();
		return new GeneralSettingPage(driver);
	}
	
	
	
	

}
