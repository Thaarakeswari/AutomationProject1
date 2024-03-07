package SrcfileAutomationproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testdata.FetchingData;

public class Amazon_NewUser extends FetchingData{
	WebDriver driver;
	@FindBy(xpath="//span[text()='Account & Lists']")
	WebElement accounts;
	@FindBy(linkText="Start here.")
	WebElement registerlink;
	
	@FindBy(id="ap_customer_name")
	WebElement name1;
	
	@FindBy(id="ap_phone_number")
	WebElement mobilenumber;
	
	@FindBy(id="ap_password")
	WebElement newpassword;
	
	@FindBy(id="continue")
	WebElement verifymobilenum;
	
	
	
	
	@FindBy(xpath="//h4[.='Mobile number already in use']")
	WebElement errormessage;
	public void accounts(WebDriver driver)
	{
	
	Actions a1=new Actions(driver);
	a1.moveToElement(accounts).perform();
	}
	public void clickregister()
	{
		registerlink.click();
	}
	
	public void name()
	{
		name1.sendKeys(name);
	}
	public void mobilenumber()
	{
		mobilenumber.sendKeys(phnumber);
	}
	public void enterpassword()
	{
		newpassword.sendKeys(pass);
	}
	
	public void clickverifiymobnum()
	{
		verifymobilenum.click();
	}
	public void puzzle() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	
	public String errormessage()
	{
		String n=errormessage.getText();
		return n;
	}
	
	
	public Amazon_NewUser(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
