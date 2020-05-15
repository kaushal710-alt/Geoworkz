package GeoPackPages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CartPage extends BaseTest{
	
	private static Logger log = LogManager.getLogger(CartPage.class.getName());
	
	By nameOfPlan = By.xpath("//div[@id='lblplanDetails']");
	By noOfWords  = By.xpath("//div[@id='lblWordsLimit']");
	By checkoutButton = By.xpath("//button[@id='btnCheckout']");
	
	public void getPlanDetails () 
	{
		String planName= driver.findElement(nameOfPlan).getText();
		//System.out.println(planName);
		Assert.assertEquals(planName, "FreelancerFreeTrial");
		
		String words= driver.findElement(noOfWords).getText();
		Assert.assertEquals(words, "5,000");
		log.info("The number of words present in the page match with the expected number of words");
		
	}
	
	public void clickCheckoutButton () 
	{
		driver.findElement(By.xpath("//button[@id='btnCheckout']")).click();
		
	}
	
	public void clickOnCheckoutButton() 
	{
		
		driver.findElement(checkoutButton).click();
	}
	
	public void supportDropDown() 
	{
		WebElement SupportDropDownOptions = driver.findElement(By.xpath("//select[@id='ddlSupportType']"));
		Select dropDown = new Select (SupportDropDownOptions);
		
		List <WebElement> list = dropDown.getOptions();
		
		for (int i=0;i<list.size();i++) 
		{
			String option =list.get(i).getText();
			if (option.contains("Extended"))
			{
				list.get(i).click();
				
			}
		}
	}

}
