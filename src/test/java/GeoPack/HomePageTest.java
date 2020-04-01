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
<<<<<<< HEAD
=======
	   System.out.println("Started Integration automatically");
		System.out.println("again commited changes123");
	   
>>>>>>> 808e3f8df262662f366e751ddcc897d715043fc1
	}
    
    @Test
	
   	public void SupportLinkValidation () 
   	{
   		HomePage home = new HomePage(driver);
   	    home.getSupportLinkPresence();
   	    System.out.println("Hi");
   	}
}
