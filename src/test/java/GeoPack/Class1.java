package GeoPack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Class1 extends BaseTest {
	
	@Test
	
	public void getTest1 () 
	{
		getDriver().findElement(By.linkText("Learn HTML")).click();
	}

}
