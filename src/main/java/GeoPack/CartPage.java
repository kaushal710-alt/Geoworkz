package GeoPack;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartPage extends BaseTest{
	
	By nameOfPlan = By.xpath("//div[@id='lblplanDetails']");
	By noOfWords  = By.xpath("//div[@id='lblWordsLimit']");
	
	public void getPlanDetails () 
	{
		String planName= driver.findElement(nameOfPlan).getText();
		System.out.println(planName);
		Assert.assertEquals(planName, "FreelancerFreeTrial");
		
		String words= driver.findElement(noOfWords).getText();
		Assert.assertEquals(words, "5,000");
	}

}
