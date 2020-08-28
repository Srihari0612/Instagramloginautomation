package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By email = By.name("username");
	By pass = By.name("password");
	By but = By.cssSelector("*[class = 'sqdOP  L3NKy   y3zKF     ']");
	public WebElement putEmail()
	{
		return driver.findElement(email);
	}
	public WebElement putPass()
	{
		return driver.findElement(pass);
	}
	public WebElement clickButton()
	{
		return driver.findElement(but);
	}

}
