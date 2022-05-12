package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateKpiPage extends PageBase{

	WebDriverWait wait;
	public UpdateKpiPage(WebDriver driver) {
		super(driver);
		
	}

	

	
	private By InputkPI_title = By.xpath("//input[@formcontrolname='title']");
	private By Businessunit = By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='businessUnit']");
	private By optionWBU = By.xpath("(//span [contains(text(),'WBU ')])");
	private By subunit= By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='subUnit']");
	private By optionsub=By.xpath("(//span [contains(text(),'WBU ')])");
	private By function = By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='functions']");
	private By Optionfunction = By.xpath("(//span [contains(text(),'Roaming')])");
	private By kpiType=By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='kpiTypes']");
	private By kpitypeoption=By.xpath("(//span [contains(text(),'OB Roamer 1st LU Time')])");
	private By removekpiownerBtn=By.xpath("(//a[@class='remove'])[1]");
	private By ownername = By.xpath("//input[@formcontrolname='ownerName']");
	private By UpdateBtn=By.xpath("//button[contains(text(),'Update KPI')]");
	
	public void UpdateKpiTitle(String title)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(InputkPI_title).clear();
		driver.findElement(InputkPI_title).sendKeys(title);
	}
	
	public void Update_Bussiness_Unit_Dropdown()
	{
		 wait=new WebDriverWait(driver, Duration.ofSeconds(200));		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='businessUnit']")));
		driver.findElement(Businessunit).click();
		driver.findElement(optionWBU).click();
	}
	
	public void Update_Sub_Unit_Dropdown()
	{
		 wait=new WebDriverWait(driver, Duration.ofSeconds(200));		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='subUnit']")));
		driver.findElement(subunit).click();
		driver.findElement(optionsub).click();
	}
	
	public void Update_Function_Dropdown()
	{
		 wait=new WebDriverWait(driver, Duration.ofSeconds(200));		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='functions']")));
		driver.findElement(function).click();
		driver.findElement(Optionfunction).click();
	}
	
	public void Update_kpiTypes_Dropdown()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(200));		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='kpiTypes']")));
		driver.findElement(kpiType).click();
		driver.findElement(kpitypeoption).click();
	}
	
	public void Update_OwnerName()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,800)", "");
		driver.findElement(removekpiownerBtn).click();
		driver.findElement(ownername).sendKeys("Mohamed Fawzi",Keys.TAB);
		driver.findElement(UpdateBtn).click();
	}
}
