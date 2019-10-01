package stepDefinition;



import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.landingPage;
import pageObjects.loginPage;
import pageObjects.portalHome;

import org.junit.runner.RunWith;
import resources.Base;

@RunWith(Cucumber.class)

public class stepDefinition extends Base{

   
	 @Given("^Initialize the chrome browser$")
	    public void initialize_the_chrome_browser() throws Throwable {
		 driver = InitializeDriver();
	    }
	 
	 	@And("^open the home page \"([^\"]*)\"$")
	    public void open_the_home_page_something(String strArg1) throws Throwable {
	        //throw new PendingException();
	 		driver.get(strArg1);
	    }

	    @And("^click on sign in link$")
	    public void click_on_sign_in_link() throws Throwable {
	       // throw new PendingException();
	    	
	    	landingPage lp = new landingPage(driver);
	    	
	    	if (lp.getPopupSize()>0)
	    	{
	    		lp.getPopup().click();
	    	}
			lp.getLogin().click();
	    }

	    
	    @When("^user enters (.+) and (.+) and click log in$")
	    public void user_enters_and_and_click_log_in(String username, String password) throws Throwable {
	    	loginPage lop = new loginPage(driver);
			lop.getEmail().sendKeys(username);
			lop.getPassword().sendKeys(password);
			//System.out.println(text);
			lop.getSignin().click();
	    }

	    @Then("^verify successful log in$")
	    public void verify_successful_log_in() throws Throwable {
	    	
	    	portalHome ph = new portalHome(driver);
	    	Assert.assertTrue(ph.getSearch().isDisplayed());
	    	
	    }
	    @And("^Close all browsers$")
	    public void close_all_browsers() throws Throwable {
	        driver.quit();
	    }
	   
	
	
}