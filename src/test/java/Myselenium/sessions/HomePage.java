package Myselenium.sessions;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Resources.Base;
import pageObject.LandingPage;
import pageObject.LoginPage;

public class HomePage extends Base  {

	
	
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String email,String pass,String user) throws FileNotFoundException, InterruptedException
	{
		
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		
		LoginPage lp = new LoginPage(driver);
		lp.putEmail().sendKeys(email);
		Thread.sleep(1000);
		lp.putPass().sendKeys(pass);
		System.out.println(user);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.clickButton().click();
		Thread.sleep(1000);
		driver.close();
		
	
		
	
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[6][3];
		data[0][0] = "Acdsh@gmas.com";
		data[0][1] = "125888";
		data[0][2] = "User 1";
		
		data[1][0] = "Bcdsh@gmas.com";
		data[1][1] = "125888";
		data[1][2] = "User 2";
		
		data[2][0] = "cdsh@gmas.com";
		data[2][1] = "125888";
		data[2][2] = "User 3";
		
		data[3][0] = "Dcdsh@gmas.com";
		data[3][1] = "125888";
		data[3][2] = "User 4";
		
		data[4][0] = "Ecdsh@gmas.com";
		data[4][1] = "125888";
		data[4][2] = "User 5";
		
		data[5][0] = "Fcdsh@gmas.com";
		data[5][1] = "125888";
		data[5][2] = "User 6";
		
		return data;
		
		
		
	}
	
	
	
	
	

}
