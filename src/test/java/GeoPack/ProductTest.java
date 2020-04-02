package GeoPack;

import org.testng.annotations.Test;

public class ProductTest extends BaseTest{
	@Test
	public void GetPlans() throws InterruptedException {
	ProductPage productPage = new ProductPage();
	productPage.getProductPlans();
	}
	@Test
	public void selectPlan() throws InterruptedException {
	CartPage cartPage = new CartPage();
	cartPage.getPlanDetails();
	}
}
