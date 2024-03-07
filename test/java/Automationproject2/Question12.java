package Automationproject2;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import srcfile_Automationproject2.Onewayserachpag;
import srcfile_Automationproject2.login;
import testdataloginairlineapplication.Testdata_logindetails;

public class Question12 extends Launchquit {
	//verify usercan successfully register goibibo application.

		@Test
		public void registration() throws InterruptedException, EncryptedDocumentException, IOException
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
			assertEquals(true,a1.searchresult());

			
		}

}
