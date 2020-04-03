package GeoPack;

import org.openqa.selenium.By;

public class OurPlansPage extends BaseTest{
	
	By signUp = By.id("lnkFreelanceFreeTrail");
	
	
	public void clickSignUpButton() 
	{
		driver.findElement(signUp).click();
	}
}
