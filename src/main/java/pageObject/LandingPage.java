package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

		//All  object in First Page can be coded in this class
		// All elements Locators etc..

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By signin = By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a");
	
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}

}
