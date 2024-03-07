package SrcfileAutomationproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Address {
	WebDriver driver;
	//locating each components using @FindBy annotations
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement update_address;
	
	public void address() throws InterruptedException
	{
		
		update_address.click();
	}

	public Amazon_Address(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}

