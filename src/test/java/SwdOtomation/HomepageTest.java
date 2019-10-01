package SwdOtomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.Base;

public class HomepageTest extends Base{

	public static Logger lggr = LogManager.getLogger(Base.class.getName());
@BeforeTest
	
	public void initialize() throws IOException
	{
		driver = InitializeDriver();
	
		
		
	}

	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password, String text) throws IOException
	{
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("C://test//test3.html");
		
        // Create object of ExtentReports class- This is main class which will create report
	    ExtentReports extent = new ExtentReports();
	    
        // attach the reporter which we created in Step 1
	    extent.attachReporter(reporter);
	    
        // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger=extent.createTest("xxxLoginTest");
	    
        // log method will add logs in report and provide the log steps which will come in report
	    logger.log(Status.INFO, "Login to amazon");
	   
	    logger.log(Status.PASS, "Title verified");
		driver.get(prop.getProperty("url"));
		//driver = InitializeDriver();
		//driver.get(prop.getProperty("url"));
		
		// access to object
		//1. extends
		//2. create object
		
		landingPage lp = new landingPage(driver);
		

		lp.getLogin().click();
		
		loginPage lop = new loginPage(driver);
		lop.getEmail().sendKeys(username);
		lop.getPassword().sendKeys(password);
		//System.out.println(text);
		lop.getSignin().click();
		logger.log(Status.PASS, "passed hp");
		extent.flush();
	}
	
	
	
	@DataProvider
	public Object [][]  getData() {
		
		
		Object [][] data = new Object[2][3];
		data [0][0]  = "nonrestrictedus@hotm.com";
		data [0][1]  = "abcd";
		data [0][2]  = "urestricted users";
		
		data [1][0]  = "restrictedus@hotm.com";
		data [1][1]  = "cvbn";
		data [1][2]  = "restricted users";
		
		return data;
		
		
				
	}
	
	
	@AfterTest
	public void closeWindow() {
		driver.close();
		driver = null;
	}
	
	
}
