package Automationproject2;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import srcfile_Automationproject2.Addonspage;
import srcfile_Automationproject2.Couponcode;
import srcfile_Automationproject2.Onewayserachpag;
import srcfile_Automationproject2.SearchFlightspage;
import srcfile_Automationproject2.login;
import srcfile_Automationproject2.paymentpage;
import testdataloginairlineapplication.Testdata_logindetails;

public class Question15 extends Launchquit {
	//verify usercan successfully register goibibo application.

	@Test
	public void payment() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login l1=new login(driver);
		Testdata_logindetails.data();
		l1.phoneno();
		l1.otp();
		Assert.assertEquals("Congratulations",l1.successfulloginmessage());
		Onewayserachpag a1=new Onewayserachpag(driver);
		a1.closelogin();
	    a1.from();
	    a1.text();
		a1.totext();
		a1.date();
		a1.done();
		a1.done1();
		a1.serachflight();
		SearchFlightspage a3=new SearchFlightspage(driver);
		a3.viewfare();
		a3.bookflight();
		Couponcode a4=new Couponcode(driver);
		a4.windowhandles(driver);
		a4.gender();
		a4.firstname();
		a4.lastname();
		a4.email();
		a4.proceed();
		a4.securetrip();
		a4.proceed();
		a4.finalbutton();
		a4.proceed();
		a4.button();
		assertEquals(true, a4.proceed1());
		Addonspage a5=new Addonspage(driver);
		a5.extra_legroom_charge();
		assertEquals(true,a5.extra_legroom_charge1());
		a5.meals();
		assertEquals(true,a5.meals1());
		a5.baggage();
		assertEquals(true,a5.baggage1());
		a5.proceedpayment();
		paymentpage a6=new paymentpage(driver);
		a6.credit_payment();
	    a6.credit_number();
		a6.month();
		a6.year();
		a6.cvv();
		a6.cardname();

}
}