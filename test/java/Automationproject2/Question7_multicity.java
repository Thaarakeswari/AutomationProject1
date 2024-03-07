package Automationproject2;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import srcfile_Automationproject2.Multicitysearchpage;

public class Question7_multicity extends Launchquit {
	

@Test
	public void multicity() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		Multicitysearchpage a1=new Multicitysearchpage(driver);
		a1.closelogin();
		a1.multicity();
		a1.from();
		a1.text();
		a1.totext();
		a1.depaturedate();
		a1.deapturebutton();
		a1.Travellers();
		a1.secondfrom();
		a1.secondfromtext();
		a1.secondtotext();
		a1.date();
	    a1.done(driver);
		a1.serachflight();
}
}