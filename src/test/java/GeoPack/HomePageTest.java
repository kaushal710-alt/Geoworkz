package GeoPack;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HomePageTest extends BaseTest {
	
	@Test
	
	public void logoValidation () 
	{
		HomePage home = new HomePage(driver);
	    home.getLogoPresence();
	    //home.getHomeLinkPresence();
	    //org.testng.Assert.assertEquals(12, 13);
	}
	
    @Test
	
	public void HomeLinkValidation () 
	{
		HomePage home = new HomePage(driver);
	    home.getHomeLinkPresence();
	    //org.testng.Assert.assertEquals(12, 13);
	   
	}
}
