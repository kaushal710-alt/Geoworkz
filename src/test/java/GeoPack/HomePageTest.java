package GeoPack;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	@Test
	
	public void logoValidation () 
	{
		HomePage home = new HomePage(driver);
	    home.getLogoPresence();
	    home.getHomeLinkPresence();
	}
	
    @Test
	
	public void HomeLinkValidation () 
	{
		HomePage home = new HomePage(driver);
	    home.getHomeLinkPresence();
	}
}
