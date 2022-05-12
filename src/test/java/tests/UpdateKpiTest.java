package tests;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import pages.GeneralSettingPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UpdateKpiPage;
import utilties.JsonDataReader;

public class UpdateKpiTest extends BaseTest {
   
	GeneralSettingPage generalSettingobjct;
	 LoginPage loginPageobjct;
	 HomePage homepageobjct;
	 UpdateKpiPage UpdateKpiPageObjct;
//	
//	@Test(priority = 1)
//	public void testsuccessfulllogin()
//	{
//		loginPageobjct=new LoginPage(driver);
//		loginPageobjct.SetEmail("asleem");
//		loginPageobjct.SetPassword("asleem123");
//		loginPageobjct.ClickLoginPage();
//		assertEquals(driver.getTitle(),"CEO Dashboard");
//	}
	
//	@Test()
//	public void GetToAddKpiPage()
//	{
//		
//		homepageobjct=new HomePage(driver);
//		homepageobjct.clickOnHompageSetting();
//		generalSettingobjct= new GeneralSettingPage(driver);
//		generalSettingobjct.ClickOnKpiMangement();
//	}
	
	@Test(priority = 2)
	public void UserCanUpdateKpi() throws FileNotFoundException, IOException, ParseException
	{
	    JsonDataReader jsonreader= new JsonDataReader("\\src\\test\\java\\data\\UpdateKPIData.json");
	    JSONArray array =jsonreader.getJsonArray();
	    for(Object obj:array)
	    {
	    	JSONObject updatedata=(JSONObject)obj;
	    	String title=  (String) updatedata.get("title");
	    
		generalSettingobjct=new GeneralSettingPage(driver);
		generalSettingobjct.ExpandAllItems();
		generalSettingobjct.navigatetoUpdatPage();
		UpdateKpiPageObjct=new UpdateKpiPage(driver);
		UpdateKpiPageObjct.UpdateKpiTitle(title);
		UpdateKpiPageObjct.Update_Bussiness_Unit_Dropdown();
		UpdateKpiPageObjct.Update_Sub_Unit_Dropdown();
		UpdateKpiPageObjct.Update_Function_Dropdown();
		UpdateKpiPageObjct.Update_kpiTypes_Dropdown();
		UpdateKpiPageObjct.Update_OwnerName();
		 String actual=driver.getCurrentUrl();
		 assertEquals(actual,"http://localhost:5200/#/settings/kpi-setting/update/ASHRAFAUTOMATION");
	}
	}
}
