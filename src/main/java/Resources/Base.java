package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import sun.net.ftp.FtpDirEntry.Type;

public class Base {
	
	//initialize Driver one place
	//since we cannot write driver for Thousands of test case 
	// all of the test cases pointing to this file for driver
	public WebDriver driver;
	public Properties prop;
	

	public WebDriver intializeDriver() throws FileNotFoundException
	{
		//Based upon browser we need to invoke 
		 prop = new Properties();
		FileInputStream fis  = new FileInputStream("C:\\Users\\Harisri\\eclipse-workspace\\sessions\\src\\main\\java\\Resources\\data.properties");
		
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome") )
		{
			//execute in chrome
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Harisri\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName == "firefox")
		{
			//execute in firefox
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	

}
