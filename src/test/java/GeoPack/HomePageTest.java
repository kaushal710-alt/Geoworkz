package GeoPack;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HomePageTest extends BaseTest {
	
	@Test
	
	public void logoValidation () 
	{
		HomePage home = new HomePage(driver);
	    home.getLogoPresence();
	   
	}
	
    @Test
	
	public void HomeLinkValidation () 
	{
		HomePage home = new HomePage(driver);
	    home.getHomeLinkPresence();
	   System.out.println("Started Integration automatically");
		System.out.println("again commited changes");
	   
	}
}
