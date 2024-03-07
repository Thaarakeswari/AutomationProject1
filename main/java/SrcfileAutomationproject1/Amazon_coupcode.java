package SrcfileAutomationproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_coupcode {
	WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Enter Code']")
	WebElement code;
	@FindBy(xpath="(//span[@class='a-button-inner']/input)[2]")
	WebElement apply;
	@FindBy(xpath="(//div[@class='a-alert-content'])[2]/p")
	WebElement apply1;
	public void couponcode()
	{
		code.sendKeys("ABCD");	
	}
	public void aplycode()
	{
		code.click();
	}
	public String applycod1()
	{
		String n=apply1.getText();
		return n;
	}
	public Amazon_coupcode(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
