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
	By Support = By.cssSelector("a[id='menuSupport']");
	By Product = By.cssSelector("a[id='menuProduct']");
	By Contact = By.cssSelector("a[id='menuContact']");
	
	public void getLogoPresence() 
	{
	driver.findElement(By.xpath("//a[@id='btnAccept']")).click();
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
	
	public void getSupportLinkPresence () 
	{
		Assert.assertTrue(driver.findElement(Support).isDisplayed(), "Support link is not displayed");
	}
	public void getProductLinkPresence () 
	{
		Assert.assertTrue(driver.findElement(Product).isDisplayed(), "Support link is not displayed");
	}
	public void getContactLinkPresence () 
	{
		Assert.assertTrue(driver.findElement(Contact).isDisplayed(), "Support link is not displayed");
	}
}


