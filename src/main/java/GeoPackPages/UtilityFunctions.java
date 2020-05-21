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
	
//	public static String getTestDataFromXMLFile(String strXpath) {
//		String valTobereturned = null;
//		try {
//
//			strXpath = "Automation/" + getpropertyFromPropertyfile("AppEnv") + "/" + strXpath;
//			File xmlfile = new File("TestData.xml");
//
//			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//
//			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//
//			Document doc = dBuilder.parse(xmlfile);
//
//			doc.getDocumentElement().normalize();
//
//			XPath xPath = XPathFactory.newInstance().newXPath();
//
//			NodeList nodelst = (NodeList) xPath.compile(strXpath).evaluate(doc, XPathConstants.NODESET);
//
//			valTobereturned = nodelst.item(0).getTextContent();
//		} catch (Exception e) {
//
//			Assert.fail("exception occured while reading data from xml file: " + e.toString());
//		}
//
//		return valTobereturned;
//	}
}
