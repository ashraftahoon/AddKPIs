package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;

import pages.AddKPiSettingsPage;
import pages.GeneralSettingPage;
import pages.HomePage;
import pages.LoginPage;
import utilties.JsonDataReader;

public class AddKPiSettingTest extends BaseTest {  
	GeneralSettingPage generalSettingobjct;
	LoginPage loginPageobjct;
	HomePage homepageobjct;
	AddKPiSettingsPage addkpiobjct;
	JsonDataReader jsonReader;
	JSONArray KPIData;
//	@Test(priority = 1)
//	public void testsuccessfulllogin() throws IOException, ParseException
//	{
//		 jsonReader= new JsonDataReader("\\src\\test\\java\\data\\logindata.json");
//		 KPIData=jsonReader.getJsonArray();
//		 
//		for(int i=0;i<KPIData.size();i++)
//		{
//			JSONObject login=(JSONObject) KPIData.get(i);
//			String  username=(String) login.get("username");
//			String  password=(String) login.get("password");
//
//			loginPageobjct=new LoginPage(driver);
//			loginPageobjct.SetEmail(username);
//			loginPageobjct.SetPassword(password);
//			loginPageobjct.ClickLoginPage();
//			assertEquals(driver.getTitle(),"CEO Dashboard");
//		}
//	}
//
//
//	@Test(priority = 2)
//	public void GetToAddKpiPage()
//	{
//
//		homepageobjct=new HomePage(driver);
//		homepageobjct.clickOnHompageSetting();
//		generalSettingobjct= new GeneralSettingPage(driver);
//		generalSettingobjct.ClickOnKpiMangement();
//		generalSettingobjct.clickonaddkpi();
//		assertEquals(driver.getCurrentUrl(),"http://localhost:5200/#/settings/kpi-setting/add");
//	}

	@Test(priority = 3)
	public void TestAdd_Kpis() throws IOException, ParseException 
	{
		 jsonReader= new JsonDataReader("\\src\\test\\java\\data\\addkpi.json");
		JSONArray KPIDatajson=jsonReader.getJsonArray();
		 
		for(int i=0;i<KPIDatajson.size();i++)
		{
			JSONObject addkpi=(JSONObject) KPIDatajson.get(i);
			String id=(String) addkpi.get("id");
			String title=(String) addkpi.get("title");
			String defntion=(String) addkpi.get("defntion");
			String O_depart=(String) addkpi.get("O_depart");
			String spoc_de=(String) addkpi.get("spoc_de");
			int year= Integer.parseInt(addkpi.get("year").toString());
			int propose= Integer.parseInt(addkpi.get("propose").toString());
			int  weight= Integer.parseInt(addkpi.get("weight").toString());
			int apply= Integer.parseInt(addkpi.get("apply").toString());
			int ambtiuos= Integer.parseInt(addkpi.get("ambtiuos").toString());
			int score= Integer.parseInt(addkpi.get("score").toString());
			int ambitious_adj= Integer.parseInt(addkpi.get("ambitious_adj").toString());
			System.out.println(ambitious_adj);
		addkpiobjct=new AddKPiSettingsPage(driver);
	    addkpiobjct.UserAdd_Kpi(year, id, title);
		addkpiobjct.ClickOnSubdropdown();
		addkpiobjct.ClickOnFunctionDropdown();
		addkpiobjct.ClickOnKpitargetDropdown();
		addkpiobjct.ClickOnMeasuredDropdown();
		addkpiobjct.ClickOnDirectionDropdown();
		addkpiobjct.ClickOnUnitDropdown();
		addkpiobjct.SetDataInfields(propose, weight, apply, ambtiuos, score, ambitious_adj, defntion, defntion, O_depart, spoc_de);
		System.out.println(AddKPiSettingsPage.actual.getText());
		assertEquals(AddKPiSettingsPage.actual.getText(),"Add KPI Settings");
		
		}
		
	}                            






}