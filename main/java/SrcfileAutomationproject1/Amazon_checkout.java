package SrcfileAutomationproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_checkout {
	@FindBy(xpath="//div[@class='a-column a-span8']/h1")
	WebElement check;
	public boolean checkoutprocess()
	{
		boolean b1=check.isDisplayed();
		return b1;
	}
	public Amazon_checkout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
