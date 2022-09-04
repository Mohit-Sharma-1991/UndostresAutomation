package undostres.ObjectRepository;

public interface HomeObjects {

	String recargaCelularBtn ="//span[contains(text(),'Recarga') and @class = 'menu-text']//ancestor::a[contains(@href,'recharge')]";
	String recargaCelularNumeroDeCelularTxt ="//label[contains(text(),'Número de celular')]//parent::div//input[@name = 'mobile']";
	String recargaCelularOperadorDdn ="//label[contains(text(),'Número de celular')]//ancestor::li//following-sibling::li//label[contains(text(),'Operador')]//parent::div//input[@name = 'operator']";
	String recargaCelularOperadorSelectTelcelDdn ="//label[contains(text(),'Número de celular')]//ancestor::li//following-sibling::li//label[contains(text(),'Operador')]//parent::div//li[contains(@style,'display') and @data-name='telcel']/a";
	String recargaCelularMontoDeRecargaDdn ="//label[contains(text(),'Número de celular')]//ancestor::li//following-sibling::li//label[contains(text(),'Monto de Recarga')]//parent::div//input[@name = 'amount']";
	String recargaCelularMontoDeRecargaSelectDdn ="//label[contains(text(),'Número de celular')]//ancestor::li//following-sibling::li//label[contains(text(),'Monto de Recarga')]//parent::div//li[contains(@style,'display')and @data-show='$10 (Recarga Saldo)']";
	String recargaCelularSiguienteBtn ="//button[text()='Siguiente' and @data-qa='celular-pay']";
	String recargaCelularPaymentScreenPge ="//div[@id='container_all_pay_options']";
	String recargaCelularTarjetaBtn ="//p[text()= 'Tarjeta']//parent::div//span[@id='cardGly']";
	String recargaCelularUsarNuevaTarjetaBtn ="//span[text()= 'Usar nueva tarjeta']//parent::a";
	String recargaCelularNúmeroDeTarjetaTxt ="//input[@placeholder= 'Número de tarjeta' and @id = 'cardnumberunique']";
	String recargaCelularMonthTxt ="//input[@placeholder= 'mm' and @name = 'expmonth']";
	String recargaCelularYearTxt ="//input[@placeholder= 'yy' and @name = 'expyear']";
	String recargaCelularCvvTxt ="//input[@placeholder= 'CVV' and @name = 'cvvno']";
	String recargaCelularEmailTxt ="//input[@placeholder= 'Correo electrónico' and @name = 'txtEmail' and not (contains(@id, 'email_paypal'))]";
	String recargaCelularPagarConTarjetaBtn ="//span[text()= 'Pagar con Tarjeta']//parent::button[@id='paylimit']";
	String recargaCelularUsernameTxt ="//label[contains(text(), 'Correo Electrónico')]//parent::div//input[@id = 'usrname']";
	String recargaCelularPasswordTxt ="//label[contains(text(), 'Contraseña')]//parent::div//input[@id = 'psw']";
	String recargaCelularCaptchaChk ="//*[@id='recaptcha-anchor']";
	String recargaCelularAccesoBtn ="//button[@id='loginBtn' and text() = 'Acceso']";
	String recargaCelularSuccessMessageLbl ="//div[text() = 'Recarga Saldo de Telcel al número 8465433546']//parent::div//div[contains(text(),'$10')]";
	
}
