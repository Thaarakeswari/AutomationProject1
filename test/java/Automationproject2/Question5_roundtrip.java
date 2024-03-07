package Automationproject2;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import srcfile_Automationproject2.Onewayserachpag;

public class Question5_roundtrip extends Launchquit{
	

@Test
	public void roundtrip() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		Onewayserachpag a1=new Onewayserachpag(driver);
		a1.closelogin();
		a1.roundtrip();
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