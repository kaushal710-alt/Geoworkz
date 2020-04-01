package GeoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class HomePage{
	
	WebDriver driver;
	public HomePage (WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By logo = By.xpath("//img[@class='logo']");
	By Home = By.id("menuHome");
	
	public void getLogoPresence() 
	{
	boolean b= 	driver.findElement(logo).isDisplayed();
	if (b) 
	{
		System.out.println("The Geoworkz logo is displayed");
	}
	else 
	{
		System.out.println("The logo is not displayed");
	}
	}
	
	public void getHomeLinkPresence () 
	{
		Assert.assertTrue(driver.findElement(Home).isDisplayed(), "The Home link is not displayed");
	}
	
}


