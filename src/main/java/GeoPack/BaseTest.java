package GeoPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
	
	public static ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>();
	static WebDriver driver=null;
	Properties prop;
	//DesiredCapabilities dr=null;
	@BeforeSuite
	
	public void initializeDriver () throws IOException, InterruptedException 
	{
		//
		prop = new Properties();
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) 
		{
			//dr=DesiredCapabilities.chrome();
           //dr.setBrowserName("chrome");
            //dr.setPlatform(Platform.WINDOWS);
         ChromeOptions opt=new ChromeOptions();
         opt.setPageLoadStrategy(PageLoadStrategy.NONE);
			
			
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
			//driver=new RemoteWebDriver(new    URL("http://192.168.0.103:4444/wd/hub"), dr);
	driver = new ChromeDriver(opt);
		
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
		
		
		setWebDriver(driver);
		getDriver().get(prop.getProperty("url"));
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
public void setWebDriver(WebDriver driver) {
		// TODO Auto-generated method stub
	dr.set(driver);
		
	}

public WebDriver getDriver()
{
	return dr.get();
	}


//@AfterSuite
public void tearDown() 
    {
	driver.quit();	
	}
}
