package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

		public loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebDriver driver;
	//By signIn = By.xpath("//span[contains(text(),'Login')]");
	//By signin = By.cssSelector("a[href*='sign_in']");
	
	By email = By.cssSelector("[id='user_email']");
	By password = By.cssSelector("[id='user_password']");
	By signin = By.cssSelector("[value='Log In']");
	
	
	
	

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSignin()
	{
		return driver.findElement(signin);
	}
}
