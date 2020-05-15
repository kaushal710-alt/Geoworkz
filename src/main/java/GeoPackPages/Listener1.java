package GeoPackPages;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		//BaseTest b = new BaseTest();
		String name = result.getName();
		//BaseTest b = new BaseTest();
		System.out.println(BaseTest.driver);
		Random r = new Random ();
		int num = r.nextInt(1000);
		TakesScreenshot ts = (TakesScreenshot) BaseTest.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File (System.getProperty("user.dir") +"\\ScreenShots\\"+name+num+"error.png");
		//File dest = new File (System.getProperty("user.dir")+ "\\ScreenShots" + name + "error.png");
		//File dest = new File ("C:\\Users\\cc\\Desktop\\Testing\\Selenium\\Projects\\Geoworkz\\ScreenShots\\" + name + "error.png");
		try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
