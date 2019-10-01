package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	private static final String FileUtils = null;
	public static WebDriver driver;
	public Properties prop;

	public WebDriver InitializeDriver() throws IOException
	{
	
		prop = new Properties();
		 // instead of  C:\\Users\\ASUS\\E2EProject we use 	System.getProperty("user.dir")
	
				//FileInputStream fis = new FileInputStream("C:\\Users\\ASUS\\E2EProject\\src\\main\\java\\resources\\data.properties");
				//same thing should be done for other hard coded paths
				FileInputStream fis = new FileInputStream(	System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
				prop.load(fis);
				
				//the following browsername should be used to run from testNG
				//String browsername = prop.getProperty("browser");
				
				//mvn test -Dbrowser=chrome if you would like to work from mvn command line
				String browsername = System.getProperty("browser");
				
				if (browsername.contains("chrome") )
				{ 
					
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\austin\\selenium\\chromedriver\\chromedriver.exe");
					ChromeOptions options = new ChromeOptions();
					if (browsername.contains("headless") )
					{
						System.out.println("in headless");
						options.addArguments("headless");						
					}
					driver = new ChromeDriver(options);
					
				}
				
				if (browsername.equals("firefox") )
				{
					System.out.println("in firefox");
					
					System.setProperty("webdriver.gecko.driver","C:\\Users\\ASUS\\Documents\\austin\\selenium\\geckodriver.exe");
					driver = new FirefoxDriver();
				}
				
				if (browsername.equals("IE") )
				{
					
					System.setProperty("webdriver.ie.driver","C:\\Users\\ASUS\\Documents\\austin\\selenium\\MicrosoftWebDriver.exe");
					driver = new InternetExplorerDriver();
				}
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
				return driver;
				
	}
	
	public void getScreenShot(String result) {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		source.renameTo(new File ("C://test//"+result+"screenshotoutput.png"));
	}

}
