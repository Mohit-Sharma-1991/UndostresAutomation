package undostres.CommonFuntions;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import undostres.CommonClassesReusable.AGlobalComponents;
import undostres.CommonClassesReusable.BrowserSelection;
import undostres.CommonClassesReusable.dynamicwait;


public class LoginPage extends BrowserSelection {

	
	public static boolean hitURL() throws Exception
	{
		System.out.println("**************************** login **********************************");		
		driver.get(AGlobalComponents.applicationURL);
		System.out.println("Successfully: open url- "+AGlobalComponents.applicationURL);
		dynamicwait.WAitUntilPageLoad2();

		return true;
	}
}
