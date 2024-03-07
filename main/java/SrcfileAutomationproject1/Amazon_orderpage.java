package SrcfileAutomationproject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_orderpage {
	WebDriver driver;
	 @FindBy(xpath="//span[text()='Your Orders']")
	  WebElement ordersnavigation;
//	@FindBy(xpath="//span[.='Returns']")
//	WebElement Returns;
	@FindBy(xpath="(//span[@class='a-button-inner'])[2]")
	WebElement orderbutton;
	@FindBy(id="time-filter")
	WebElement date;
	@FindBy(xpath="(// a[@id='Write-a-product-review_2'])[1]")
	WebElement productreview;
	@FindBy(xpath="//span[@class='a-color-error ryp__icon-alert__text']/span")
	WebElement msg;
//	public void ordersandreturns(WebDriver driver)
//	{
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(Returns));
//		
//		Actions a1=new Actions(driver);
//		a1.moveToElement(Returns).build();
//		
//	}
	public void ordersnavigation()
	{
		ordersnavigation.click();
		
	}
	
	public void orderbutton()
	{
		orderbutton.click();
		
	}
	public void date()
	{
		Select dd=new Select(date);
		dd.selectByValue("year-2021");
		
		
	}
	public void Rating()
	{
		productreview.click();
		
		
	}
	
	public String message()
	{
		String n=msg.getText();
		return n;
	}
	
public Amazon_orderpage (WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
}
