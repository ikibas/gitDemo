package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {

	
	public WebDriver driver;
	private By signIn = By.xpath("//span[contains(text(),'Login')]");
	//By signin = By.cssSelector("a[href*='sign_in']");
	private By text1 = By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/h2[1]");
	
	private By Navigation = By.xpath("/html[1]/body[1]/header[1]/div[2]/div[1]/nav[1]/ul[1]");
	private By Navigation2 = By.cssSelector("div[class*='video-banner'] h3");
	
	private By popup = By.xpath("//Button[text()='NO THANKS']");
	
	
	public landingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signIn);
	}

	public WebElement getText1()
	{
		return driver.findElement(text1);
	}
	public WebElement getText2()
	{
		return driver.findElement(Navigation2);
	}
	
	
	public WebElement getNavigation()
	{
		return driver.findElement(Navigation);
	}
	
	public  int getPopupSize()
	{
		return driver.findElements(popup).size();
	}
	public WebElement getPopup()
	{
		return driver.findElement(popup);
	}
	
}
