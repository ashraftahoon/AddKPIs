package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralSettingPage extends PageBase {
   
	WebDriverWait wait;
	public GeneralSettingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	private By KpiMangementLink=By.linkText("KPIs Management");
	private By AddKpiBtn=By.xpath("//*[@id=\"main\"]/div/div[2]/app-settings/div/div/div/div/tabset/div/tab[4]/app-kpi-setting-list/div[1]/div[6]/button");
	//private By displayitem=By.xpath("//div/mat-select[@id='mat-select-6']");
	private By displayitem=By.xpath("//div/mat-select[@id='mat-select-36']");
	private By displaylastitem=By.xpath("(//span [contains(text(),' 100 ')])");
	private By KpiUpdateBtn=By.xpath("(//button[@class='mat-tooltip-trigger p-button p-button-success p-mr-2 p-component p-button-icon-only'])[43]");
	
	public void ClickOnKpiMangement()
	{
		driver.findElement(KpiMangementLink).click();
	}
	
	public AddKPiSettingsPage clickonaddkpi()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(AddKpiBtn).click();
		return new AddKPiSettingsPage(driver);
	}
	
	public void ExpandAllItems()
	{
		
	    wait= new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(displayitem))); 
		driver.findElement(displayitem).click();
	}
	
	public UpdateKpiPage navigatetoUpdatPage()
	{
		wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(displaylastitem)); 
		driver.findElement(displaylastitem).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", driver.findElement(KpiUpdateBtn));
		
	    return new UpdateKpiPage(driver);
	}
	
	
	
}
