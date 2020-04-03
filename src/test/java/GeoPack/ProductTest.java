package GeoPack;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest{
	@Test
	public void checkoutProcess() throws InterruptedException, IOException {
	HomePage home = new HomePage(driver);
	home.clickOurPlansButton();
	
	OurPlansPage opp = new OurPlansPage ();
	opp.clickSignUpButton();
	
	CartPage cpage = new CartPage();
	cpage.getPlanDetails();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='btnCheckout']")).click();
	
	ReadingFromExcel rfe = new ReadingFromExcel ();
	HashMap<String, String> username123=rfe.getDataFromExcel();
	String username1 = username123.get("UserName");
	String password2 = username123.get("Password");
	String password3 = username123.get("RetypePassword");
	String Tenancy = username123.get("Tenancy");
	String firstName = username123.get("First Name");
	String lastName = username123.get("Last Name");
	String email = username123.get("Email");
	String address = username123.get("Address");
	String city = username123.get("City");
	String zipCode = username123.get("Zip Code");
	String phone = username123.get("Phone");
	driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(username1);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password2);
	driver.findElement(By.xpath("//input[@id='CPassword']")).sendKeys(password3);
	driver.findElement(By.xpath("//input[@id='TenancyName']")).sendKeys(Tenancy);
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstName);
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastName);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys(address);
	driver.findElement(By.xpath("//input[@id='City']")).sendKeys(city);
	driver.findElement(By.xpath("//input[@id='ZipPostalCode']")).sendKeys(zipCode);
	driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys(phone);
	
	}
	
}
