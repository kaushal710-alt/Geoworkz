package GeoPackPages;

public class UtilityFunctions extends BaseTest{
	
	
	public static void checkoutProcessWithoutExtSupport() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
        hp.clickOurPlansButton();
        OurPlansPage opp = new OurPlansPage();
        String planType = opp.getPlanType();
        opp.clickOnBuyNowButtonFreelancer(planType);
		CartPage cp = new CartPage();
		cp.clickCheckoutButton();	
	}
	
	public static void checkoutProcessWithExtSupport() throws InterruptedException 
	{
	
	HomePage hp = new HomePage(driver);
	hp.clickOurPlansButton();
	OurPlansPage opp = new OurPlansPage();
	String planType = opp.getPlanType();
	opp.clickOnBuyNowButtonFreelancer(planType);
	CartPage cp = new CartPage();
	cp.supportDropDown();
	cp.clickCheckoutButton();
	}
	
	public static void checkoutProcessWithoutExtSupportAgency() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		hp.clickOurPlansButton();
		OurPlansPage opp = new OurPlansPage();
		String planType = opp.getPlanType();
		opp.clickPlanTypeButton(planType);
		opp.clickOnBuyNowButtonAgency(planType);
		CartPage cp = new CartPage();
		cp.clickCheckoutButton();	
	}
	
	public static void checkoutProcessWithExtSupportAgency() throws InterruptedException 
	{
	
		HomePage hp = new HomePage(driver);
		hp.clickOurPlansButton();
		OurPlansPage opp = new OurPlansPage();
		String planType = opp.getPlanType();
		opp.clickPlanTypeButton(planType);
		opp.clickOnBuyNowButtonAgency(planType);
		CartPage cp = new CartPage();
		cp.supportDropDown();
		cp.clickCheckoutButton();
	}
	
	public static void checkoutProcessWithoutExtSupportEnterPrize() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		hp.clickOurPlansButton();
		OurPlansPage opp = new OurPlansPage();
		String planType = opp.getPlanType();
		opp.clickPlanTypeButton(planType);
		opp.clickOnBuyNowButtonEnterPrize(planType);
		CartPage cp = new CartPage();
		cp.clickCheckoutButton();	
	}
	
	public static void checkoutProcessWithExtSupportEnterPrize() throws InterruptedException 
	{
	
		HomePage hp = new HomePage(driver);
		hp.clickOurPlansButton();
		OurPlansPage opp = new OurPlansPage();
		String planType = opp.getPlanType();
		opp.clickPlanTypeButton(planType);
		opp.clickOnBuyNowButtonEnterPrize(planType);
		CartPage cp = new CartPage();
		cp.supportDropDown();
		cp.clickCheckoutButton();
	}
}
