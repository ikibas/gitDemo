package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalHome {

	
	public WebDriver driver;
	
	private By portalsearch = By.name("query");
	
	
	public portalHome(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	
	
	public WebElement getSearch()
	{
		return driver.findElement(portalsearch);
	}
}
