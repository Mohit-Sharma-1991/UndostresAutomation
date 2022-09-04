
package undostres.CommonFuntions;
import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import undostres.CommonClassesReusable.BrowserSelection;
import undostres.CommonClassesReusable.Operation;
import undostres.CommonClassesReusable.Utility;
import undostres.ObjectRepository.HomeObjects;

public class CommonMethod extends BrowserSelection 
{


	
	public static void rechargeProcess() throws Throwable
	{
		System.out.println("******************************** rechargeProcess *****************************************");
		Operation.click("xpath", HomeObjects.recargaCelularBtn, "Click on Recarga celular Button");
		
		Operation.setText("xpath", HomeObjects.recargaCelularNumeroDeCelularTxt, "8465433546", "Enter Numero de celular: 8465433546");
		Operation.click("xpath", HomeObjects.recargaCelularOperadorDdn, "Click on Operador Dropdown");
		Operation.click("xpath", HomeObjects.recargaCelularOperadorSelectTelcelDdn, "Click on 'telcel' from Dropdown");
		Operation.click("xpath", HomeObjects.recargaCelularMontoDeRecargaDdn, "Click on Monto de Recarga Dropdown");
		Operation.click("xpath", HomeObjects.recargaCelularMontoDeRecargaSelectDdn, "select '$10' from dropdown");
			
		Operation.click("xpath", HomeObjects.recargaCelularSiguienteBtn, "Click on Siguiente Button");
		
		Utility.verifyElementPresent(HomeObjects.recargaCelularPaymentScreenPge, "Payment Screen", false, false);
		Thread.sleep(1000);
		Operation.click("xpath", HomeObjects.recargaCelularTarjetaBtn, "Click on Tarjeta");
		Thread.sleep(1000);
		Operation.click("xpath", HomeObjects.recargaCelularUsarNuevaTarjetaBtn, "Click on Usar nueva tarjeta");
		
		Operation.setText("xpath", HomeObjects.recargaCelularNúmeroDeTarjetaTxt, "4111111111111111", "Enter 4111111111111111");
		Operation.setText("xpath", HomeObjects.recargaCelularMonthTxt, "11", "Enter 11");
		Operation.setText("xpath", HomeObjects.recargaCelularYearTxt, "25", "Enter 25");
		Operation.setText("xpath", HomeObjects.recargaCelularCvvTxt, "111", "Enter 111");
		
		Operation.setText("xpath", HomeObjects.recargaCelularEmailTxt, "test@test.com", "Enter 111");
		Operation.click("xpath", HomeObjects.recargaCelularPagarConTarjetaBtn, "Click on Pagar con Tarjeta Button");
		
		Operation.setText("xpath", HomeObjects.recargaCelularUsernameTxt, "automationUDT1@gmail.com", "Enter Email: automationUDT1@gmail.com");
		Operation.setText("xpath", HomeObjects.recargaCelularPasswordTxt, "automationUDT123", "Enter Password: automationUDT123");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath(HomeObjects.recargaCelularCaptchaChk)).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(1500);
		Utility.verifyElementPresentByScrollView(HomeObjects.recargaCelularAccesoBtn, "Acceso button", false, false);
		Thread.sleep(1000);
		Operation.click("xpath", HomeObjects.recargaCelularAccesoBtn, "Click on Acceso button");
		Thread.sleep(1000);
		
		if(driver.findElements(By.xpath(HomeObjects.recargaCelularSuccessMessageLbl)).size()>0)
		{
			Utility.verifyElementPresent("//div[text() = 'Recarga Saldo de Telcel al número 8465433546']//parent::div//div[contains(text(),'$10')]", "Success Message", false, false);
		}
		else
		{
			System.out.println("Success Message is Not present. Please check Application");
			logger.log(LogStatus.FAIL,"Success Message is Not present. Please check Application");
		}
		
		
		
		
		
	
	}

}