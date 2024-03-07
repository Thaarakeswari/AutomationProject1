package Automationproject2;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import srcfile_Automationproject2.Onewayserachpag;
import srcfile_Automationproject2.SearchFlightspage;

public class Question10_flightdetails extends Launchquit{
	

@Test
	public void flightdeatils() throws EncryptedDocumentException, IOException, InterruptedException
	{
	
		Onewayserachpag a1=new Onewayserachpag(driver);
		a1.closelogin();
	    a1.from();
	    a1.text();
		a1.totext();
		a1.date();
		a1.done();
		a1.adults(driver);
		a1.child(driver);
		a1.done1();
		a1.serachflight();
		SearchFlightspage a2=new SearchFlightspage(driver);
		a2.flightdetails();
		a2.faredetails(driver);
	    a2.baggagerules(driver);
	    a2.cancelrules(driver);
		assertEquals(true, a2.flightinforamtion());
		assertEquals(true, a2.faredetails());
		assertEquals(true, a2.baggagerules());
		assertEquals(true, a2.cancelrules());
}

}
