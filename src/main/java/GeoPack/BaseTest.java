package GeoPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
	
	
	WebDriver driver;
	Properties prop;
	
	@BeforeSuite
	
	public void initializeDriver () throws IOException 
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));	
		}
		else if(browserName.equals("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\geckodriver.exe");
			   driver = new FirefoxDriver();
			   driver.get(prop.getProperty("url"));
		 }
		 else if(browserName.equals("IE"))
		 {
			 System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\IEDriverServer.exe");
			   driver = new InternetExplorerDriver();
			   driver.get(prop.getProperty("url"));
		 }   
	}
	
@AfterSuite
  public void tearDown() 
	{
	driver.quit();	
	}
}
