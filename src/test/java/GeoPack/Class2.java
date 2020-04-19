package GeoPack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Class2 extends BaseTest{
	
@Test
	
	public void getTest2 () 
	{
	getDriver().findElement(By.linkText("Learn CSS")).click();
	}
}
