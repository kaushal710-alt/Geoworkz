package GeoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BaseTest{
	
	
	
	By Product = By.cssSelector("a[id='menuProduct']");
	By ourPlans = By.xpath("//a[@id='menuOurPlan']");
	By signUp = By.id("lnkFreelanceFreeTrail");

	public void getProductPlans () throws InterruptedException 
	{
		
		Actions a = new Actions (driver);
		a.moveToElement(driver.findElement(Product)).build().perform();
		driver.findElement(ourPlans).click();
		//Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(signUp));
		driver.findElement(signUp).click();
	}

}
