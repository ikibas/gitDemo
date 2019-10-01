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

public class testText extends Base{
 public static Logger lggr = LogManager.getLogger(Base.class.getName());
	landingPage lp;
	@BeforeTest
		public void initialize() throws IOException
	{
		driver = InitializeDriver();
		lggr.info("driver is initial,zed");
		driver.get(prop.getProperty("url"));
		lggr.info("driver is initial,zed");
		
	}
	@Test
	public void basePageNavigation() throws IOException
	{
		 ExtentHtmlReporter reporter=new ExtentHtmlReporter("C://test//test1.html");
			
         // Create object of ExtentReports class- This is main class which will create report
	    ExtentReports extent = new ExtentReports();
	    
         // attach the reporter which we created in Step 1
	    extent.attachReporter(reporter);
	    
         // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger=extent.createTest("zzzLoginTest");
	    
         // log method will add logs in report and provide the log steps which will come in report
	    logger.log(Status.INFO, "Login to amazon");
	   
	    logger.log(Status.PASS, "Title verified");
	   
         // Flush method will write the test in report- This is mandatory step  
	  
		
		
		// access to object
		//1. extends
		//2. create object
		
		 lp = new landingPage(driver);
		
		//System.out.println(lp.getText1().getText());
		Assert.assertEquals("FEATURED COURSES123", lp.getText1().getText());
		//Assert.assertTrue(lp.getText1().getText().equals("abcd"));
		//lp.getLogin().click();
		//loginPage lop = new loginPage(driver);
		//lop.getEmail().sendKeys(username);
		//lop.getPassword().sendKeys(password);
		//System.out.println(text);
		//lop.getSignin().click();
		logger.log(Status.SKIP, "test skipped");
		//lggr.info("successfully valideted");
		  extent.flush();
		
	}
	
	@Test
	public void headerTest() throws IOException
	{
		 ExtentHtmlReporter reporter=new ExtentHtmlReporter("C://test//test1.html");
			
         // Create object of ExtentReports class- This is main class which will create report
	    ExtentReports extent = new ExtentReports();
	    
         // attach the reporter which we created in Step 1
	    extent.attachReporter(reporter);
	    
         // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger=extent.createTest("zzzLoginTest");
	    
         // log method will add logs in report and provide the log steps which will come in report
	    logger.log(Status.INFO, "Login to amazon");
	   
	    logger.log(Status.PASS, "Title verified");
	   
         // Flush method will write the test in report- This is mandatory step  
	  
		
		
		// access to object
		//1. extends
		//2. create object
		
	lp = new landingPage(driver);
		
		//System.out.println(lp.getText1().getText());
		Assert.assertEquals("aaaa", lp.getText2().getText());
		//Assert.assertTrue(lp.getText1().getText().equals("abcd"));
		//lp.getLogin().click();
		//loginPage lop = new loginPage(driver);
		//lop.getEmail().sendKeys(username);
		//lop.getPassword().sendKeys(password);
		//System.out.println(text);
		//lop.getSignin().click();
		logger.log(Status.SKIP, "test skipped");
		//lggr.info("successfully valideted");
		  extent.flush();
		
	}
	@Test
	public void headerTest1() throws IOException
	{
		 ExtentHtmlReporter reporter=new ExtentHtmlReporter("C://test//test1.html");
			
         // Create object of ExtentReports class- This is main class which will create report
	    ExtentReports extent = new ExtentReports();
	    
         // attach the reporter which we created in Step 1
	    extent.attachReporter(reporter);
	    
         // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger=extent.createTest("zzzLoginTest");
	    
         // log method will add logs in report and provide the log steps which will come in report
	    logger.log(Status.INFO, "Login to amazon");
	   
	    logger.log(Status.PASS, "Title verified");
	   
         // Flush method will write the test in report- This is mandatory step  
	  
		
		
		// access to object
		//1. extends
		//2. create object
		
	lp = new landingPage(driver);
		
		//System.out.println(lp.getText1().getText());
		Assert.assertEquals("aaaa", lp.getText2().getText());
		//Assert.assertTrue(lp.getText1().getText().equals("abcd"));
		//lp.getLogin().click();
		//loginPage lop = new loginPage(driver);
		//lop.getEmail().sendKeys(username);
		//lop.getPassword().sendKeys(password);
		//System.out.println(text);
		//lop.getSignin().click();
		logger.log(Status.SKIP, "test skipped");
		//lggr.info("successfully valideted");
		  extent.flush();
		
	}
	@Test
	public void headerTest2() throws IOException
	{
		 ExtentHtmlReporter reporter=new ExtentHtmlReporter("C://test//test1.html");
			
         // Create object of ExtentReports class- This is main class which will create report
	    ExtentReports extent = new ExtentReports();
	    
         // attach the reporter which we created in Step 1
	    extent.attachReporter(reporter);
	    
         // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger=extent.createTest("zzzLoginTest");
	    
         // log method will add logs in report and provide the log steps which will come in report
	    logger.log(Status.INFO, "Login to amazon");
	   
	    logger.log(Status.PASS, "Title verified");
	   
         // Flush method will write the test in report- This is mandatory step  
	  
		
		
		// access to object
		//1. extends
		//2. create object
		
	lp = new landingPage(driver);
		
		//System.out.println(lp.getText1().getText());
		Assert.assertEquals("aaaa", lp.getText2().getText());
		//Assert.assertTrue(lp.getText1().getText().equals("abcd"));
		//lp.getLogin().click();
		//loginPage lop = new loginPage(driver);
		//lop.getEmail().sendKeys(username);
		//lop.getPassword().sendKeys(password);
		//System.out.println(text);
		//lop.getSignin().click();
		logger.log(Status.SKIP, "test skipped");
		//lggr.info("successfully valideted");
		  extent.flush();
		
	}
	@Test
	public void headerTest3() throws IOException
	{
		 ExtentHtmlReporter reporter=new ExtentHtmlReporter("C://test//test1.html");
			
         // Create object of ExtentReports class- This is main class which will create report
	    ExtentReports extent = new ExtentReports();
	    
         // attach the reporter which we created in Step 1
	    extent.attachReporter(reporter);
	    
         // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger=extent.createTest("zzzLoginTest");
	    
         // log method will add logs in report and provide the log steps which will come in report
	    logger.log(Status.INFO, "Login to amazon");
	   
	    logger.log(Status.PASS, "Title verified");
	   
         // Flush method will write the test in report- This is mandatory step  
	  
		
		
		// access to object
		//1. extends
		//2. create object
		
	lp = new landingPage(driver);
		
		//System.out.println(lp.getText1().getText());
		Assert.assertEquals("aaaa", lp.getText2().getText());
		//Assert.assertTrue(lp.getText1().getText().equals("abcd"));
		//lp.getLogin().click();
		//loginPage lop = new loginPage(driver);
		//lop.getEmail().sendKeys(username);
		//lop.getPassword().sendKeys(password);
		//System.out.println(text);
		//lop.getSignin().click();
		logger.log(Status.SKIP, "test skipped");
		//lggr.info("successfully valideted");
		  extent.flush();
		
	}
	
	
	
	@AfterTest
	public void closeWindow() {
		driver.close();
		driver = null;
	}
	
	
	
	
}
