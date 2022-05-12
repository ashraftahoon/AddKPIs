package pages;



import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.command.PullImageCmd;

public class AddKPiSettingsPage extends PageBase {

    public AddKPiSettingsPage(WebDriver driver) {
		super(driver);
		
	}

	
	WebDriverWait wait;

	


	private By EngageElement = By.xpath("(//button[@class='mat-button-toggle-button mat-focus-indicator'])[1]");
	private By InputYear = By.id("mat-input-6");
	private By InputkPI_id = By.id("mat-input-7");
	private By InputkPI_title = By.id("mat-input-8");
	private By Businessunit = By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='businessUnit']");
	private By optionB2B = By.xpath("(//span [contains(text(),'B2B ')])");
	private By subunit= By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='subUnit']");
	private By optionsub=By.xpath("(//span [contains(text(),'Non-Gov ')])");
	private By function = By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='functions']");
	private By Optionfunction = By.xpath("(//span [contains(text(),'Billing')])");
	private By kpitarget = By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='kpitargetType']");
	private By kpioption=By.xpath("(//span [contains(text(),'Commulative')])");
	private By measured = By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='measuredtype']");
	private By measuredoption=By.xpath("(//span [contains(text(),'Daily')])");
	private By direction = By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='direction']");
	private By directionOption=By.xpath("(//span [contains(text(),'1')])[1]");
	private By unit = By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='unit']");
	private By unitOption=By.xpath("(//span [contains(text(),'Hours')])");
	private By proposedtaget = By.xpath("//input[@formcontrolname=\"proposedTarget\"]");
	private By weight = By.xpath("//input[@formcontrolname=\"weight\"]");
	private By appliedpref = By.xpath("//input[@formcontrolname=\"appliedPerfAdj\"]");
	private By ambitioustarget = By.xpath("//input[@formcontrolname=\"ambitiousTarget\"]");
	private By baseline = By.xpath("//input[@formcontrolname=\"baseline\"]");
	private By score = By.xpath("//input[@formcontrolname=\"scoreTarget\"]");
	private By ambitioustarget_adj = By.xpath("//input[@formcontrolname=\"ambitiousTargetAdj\"]");
	private By defintion = By.xpath("//input[@formcontrolname=\"kpiDefinition\"]");
	private By formula = By.xpath("//input[@formcontrolname=\"KpiFormula\"]");
	private By ownername = By.xpath("//input[@formcontrolname=\"ownerName\"]");
	private By custodianname = By.xpath("//input[@formcontrolname=\"custodianName\"]");
	private By ownerdepart = By.xpath("//input[@formcontrolname=\"ownerDepartment\"]");
	private By spocdepart = By.xpath("//input[@formcontrolname=\"spocDepartment\"]");
	private By add_kpi_btn = By.xpath("//button[text()='Add KPI']");
	public static WebElement actual=driver.findElement(By.xpath("(//span[@class='ng-star-inserted' and @tabindex='0'])[1]"));
    
	public void UserAdd_Kpi(int year, String id,String title) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(EngageElement).click();
		driver.findElement(InputYear).sendKeys(Integer.toString(year));
		driver.findElement(InputkPI_id).sendKeys(id);
		driver.findElement(InputkPI_title).sendKeys(title);
      
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.findElement(Businessunit).click();
		driver.findElement(optionB2B).click();
		
		
	}
	
	
	  public void ClickOnSubdropdown() 
	  {	
		    wait=new WebDriverWait(driver, Duration.ofSeconds(200));		
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='subUnit']")));
			driver.findElement(subunit).click();
			driver.findElement(optionsub).click();
	  }
	
	
  public void ClickOnFunctionDropdown() 
  {	
		
	     wait=new WebDriverWait(driver, Duration.ofSeconds(200));		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='functions']")));
		 driver.findElement(function).click();
		 driver.findElement(Optionfunction).click();
  }
  
  public void ClickOnKpitargetDropdown()
  {
	     wait=new WebDriverWait(driver, Duration.ofSeconds(200));		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='kpitargetType']")));
		 driver.findElement(kpitarget).click();
		 driver.findElement(kpioption).click();
  }
  
  public void ClickOnMeasuredDropdown()
  {
	     wait=new WebDriverWait(driver, Duration.ofSeconds(200));		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='measuredtype']")));
		 driver.findElement(measured).click();
		 driver.findElement(measuredoption).click();
  }
  
  public void ClickOnDirectionDropdown()
  {
	     wait=new WebDriverWait(driver, Duration.ofSeconds(200));		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='direction']")));
		 driver.findElement(direction).click();
		 driver.findElement(directionOption).click();
   }
  
  public void ClickOnUnitDropdown()
  {
	     wait=new WebDriverWait(driver, Duration.ofSeconds(200));		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/mat-select[@role='combobox' and @formcontrolname='unit']")));
		 driver.findElement(unit).click();
		 driver.findElement(unitOption).click();
  }
  
  public void SetDataInfields(int proposed,int
			weightint,int applied,int ambtioustar,int scoree,int ambitious_adj,String
			def,String formul,String O_depart,String spoc_de)
  {
	  driver.findElement(proposedtaget).sendKeys(Integer.toString(proposed));
	  driver.findElement(weight).sendKeys(Integer.toString(weightint));
	  driver.findElement(appliedpref).sendKeys(Integer.toString(applied));
	  driver.findElement(ambitioustarget).sendKeys(Integer.toString(ambtioustar));
	  driver.findElement(score).sendKeys(Integer.toString(scoree));
	  driver.findElement(ambitioustarget_adj).sendKeys(Integer.toString(ambitious_adj));
	  driver.findElement(defintion).sendKeys(def);
	  driver.findElement(formula).sendKeys(formul);
	  driver.findElement(ownername).sendKeys("Elwan",Keys.TAB);
	  driver.findElement(custodianname).sendKeys("Elwan",Keys.TAB);
	  driver.findElement(ownerdepart).sendKeys(O_depart);
	  driver.findElement(spocdepart).sendKeys(spoc_de);
	 driver.findElement(add_kpi_btn).click();
  }
  
}


