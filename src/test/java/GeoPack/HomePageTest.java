package GeoPack;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HomePageTest extends BaseTest {
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
}
