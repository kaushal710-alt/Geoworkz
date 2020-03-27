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
	    System.out.println("Git practice");
	    System.out.println("Git practice1");
	    System.out.println("Git practic2");
	    System.out.println("Git practice3");
	    System.out.println("Git practice4");
	    System.out.println("Git practice5");
	    System.out.println("Git practice6");
	    System.out.println("Git practice7");
	    System.out.println("Git practice8");
	    System.out.println("Git practice9");
	}
}
