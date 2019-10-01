package SwdOtomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import junit.framework.Assert;
import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.Base;

public class testNavigation extends Base{
	public static Logger lggr = LogManager.getLogger(Base.class.getName());
//add logs
	// html reports
	//screenshoots
	//jenkins integration
@BeforeTest
		public void initialize() throws IOException
	{
		driver = InitializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	@Test
	public void basePageNavigation() throws IOException
	{
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("C://test//test2.html");
		
        // Create object of ExtentReports class- This is main class which will create report
	    ExtentReports extent = new ExtentReports();
	    
        // attach the reporter which we created in Step 1
	    extent.attachReporter(reporter);
	    
        // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger=extent.createTest("yyyLoginTest");
	    
        // log method will add logs in report and provide the log steps which will come in report
	    logger.log(Status.INFO, "Login to amazon");
	   
	    logger.log(Status.PASS, "Title verified");
		
		//driver = InitializeDriver();
		
		//driver.get(prop.getProperty("url"));
		
		// access to object
		//1. extends
		//2. create object
		
		landingPage lp = new landingPage(driver);
		
		//System.out.println(lp.getText1().getText());
		//Assert.assertEquals("abcd", lp.getText1().getText());
		Assert.assertTrue(lp.getNavigation().isDisplayed());
		//lp.getLogin().click();
		//loginPage lop = new loginPage(driver);
		//lop.getEmail().sendKeys(username);
		//lop.getPassword().sendKeys(password);
		//System.out.println(text);
		//lop.getSignin().click();
		logger.log(Status.PASS, "passs");
		extent.flush();
	}
	
	@AfterTest
	public void closeWindow() {
		driver.close();
		driver = null;
	}
	
	
	
	
}
