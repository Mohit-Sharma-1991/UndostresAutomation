package undostres;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import undostres.CommonClassesReusable.AGlobalComponents;
import undostres.CommonClassesReusable.BrowserSelection;
import undostres.CommonClassesReusable.dynamicwait;
import undostres.CommonFuntions.CommonMethod;
import undostres.CommonFuntions.LoginPage;
import undostres.ObjectRepository.HomeObjects;

public class Unostres extends BrowserSelection
{
	String testName;
	
	@BeforeClass
	public void Login() throws Throwable
	{
		LoginPage.hitURL();

	}
	
	@BeforeMethod
	public void commonPage(Method method) throws Throwable
	{
		testName = method.getName();
		driver.navigate().refresh();
		
	}
	
	public static void isConditionX(boolean condition)
	{
		if(condition==false)
		{
			throw new SkipException("skipp");
		}
	}

	@Test(priority=1,enabled=true)
	public void E2E_TC0001() throws Throwable 
	{
		logger =report.startTest("E2E_TC0001", "Verify recharge functionality");
		System.out.println("START----------->"+testName);
		
		/***** Recharge Process *****/
		CommonMethod.rechargeProcess();
	
		

}

}	