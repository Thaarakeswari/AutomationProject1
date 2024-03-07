package SrcfileAutomationproject1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_paymentMethodselectio {
	WebDriver driver;
	@FindBy(xpath="(//span[@class='a-button-inner']/input)[6]")
	WebElement payment;
	@FindBy(xpath="(//span[.='Use this payment method'])[2]")
	WebElement paymentbutton;
	@FindBy(xpath="//span[.='Qty:']")
	List<WebElement> reviewnumber;
	public void payment()
	{
		
		
		payment.click();	
	}
	public void paymentbutton()
	{
		
		
		paymentbutton.click();	
	}
	public boolean paymentclick()
	{
		boolean b1=payment.isDisplayed();
		return b1;
		
	}
	public int reviewnumber()
	{
		int b1=reviewnumber.size();
		return b1;
		
	}
	public Amz_paymentMethodselectio(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
