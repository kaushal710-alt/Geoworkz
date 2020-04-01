package GeoPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
	static WebDriver driver;
	Properties prop;
	//DesiredCapabilities dr=null;
	@BeforeSuite
	
	public void initializeDriver () throws IOException 
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) 
		{
			//dr=DesiredCapabilities.chrome();
           //dr.setBrowserName("chrome");
            //dr.setPlatform(Platform.WINDOWS);
           
//	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
			//driver=new RemoteWebDriver(new    URL("http://192.168.0.103:4444/wd/hub"), dr);
	driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));	
		}
		else if(browserName.equals("firefox"))
		 {
			
			 //dr=DesiredCapabilities.firefox();
		      //  dr.setBrowserName("firefox");
		      //  dr.setPlatform(Platform.WINDOWS);
			 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\geckodriver.exe");
			   driver = new FirefoxDriver();
			   driver.get(prop.getProperty("url"));
		 }
		 else if(browserName.equals("IE"))
		 {
			 //dr=DesiredCapabilities.internetExplorer();
	           // dr.setBrowserName("iexplore");
	            //dr.setPlatform(Platform.WINDOWS);
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
