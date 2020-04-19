package GeoPack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ArrayList1 extends BaseTest{
	
	
	@Test
	public void checkoutProcess() throws InterruptedException, IOException {
	HomePage home = new HomePage(driver);
	home.clickOurPlansButton();
	
	OurPlansPage opp = new OurPlansPage ();
	opp.clickSignUpButton();
	
	CartPage cpage = new CartPage();
	cpage.getPlanDetails();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//button[@id='btnCheckout']")).click();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
