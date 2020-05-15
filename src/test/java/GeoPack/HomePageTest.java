package GeoPack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import GeoPackPages.BaseTest;
import GeoPackPages.HomePage;
import junit.framework.Assert;

public class HomePageTest extends BaseTest {
	
	private static Logger log = LogManager.getLogger(HomePageTest.class.getName());
	HomePage home;
	public void initializeHomepage () 
	{
		home = new HomePage(driver);
	}
	@Test
	public void logoValidation () 
	{
		initializeHomepage ();
	    home.getLogoPresence(); 
	    
	    
	}
    @Test
	public void HomeLinkValidation () 
	{
    	initializeHomepage ();
	    home.getHomeLinkPresence();
	    
	}
    
    @Test
   	public void SupportLinkValidation () 
   	{
    	initializeHomepage ();
   	    home.getSupportLinkPresence();
   	
   	}
    public void ProductLinkValidation () 
   	{
    	initializeHomepage ();
   	    home.getProductLinkPresence();
   	}
    public void ContactLinkValidation () 
   	{
    	initializeHomepage ();
   	    home.getContactLinkPresence();
   	}
    
	
    @AfterClass
	public void closeApplication() 
	{
		driver.close();
	}
	 
}
