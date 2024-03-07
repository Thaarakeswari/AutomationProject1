package SrcfileAutomationproject1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Amazon_SearchingFilter {
	WebDriver driver;
	@FindBy(xpath="//div[@id='departments']/ul/span/span/li[2]/span/a/span")
	WebElement category;
	@FindBy(xpath="//div[@id='priceRefinements']/ul/span/span/li[1]/span/a/span[1]")
	WebElement price;
    @FindBy(xpath="//div[@id='reviewsRefinements']/ul/span/span/li/span/a/section/i")
    WebElement rating;
    @FindBy(xpath="( //div[@id='productDescription_feature_div'])[2]")
    WebElement description;
    @FindBy(xpath="(//*[contains(@class,'a-section a-spacing-base')])[1]")
    WebElement selectproduct;
    @FindBy(xpath="(//div[@class='a-section a-spacing-base a-text-center'])[1]")
    WebElement productselect1;
    
	public void category()
	{
		category.click();
		
		
	}
	public void priceselection()
	{
		price.click();
		
		
	}
	public void rating()
	{
		rating.click();
	}
	public void selectproduct()
	{
		selectproduct.click();
	}
	public void productselection()
	{
		productselect1.click();
	
	}
	public boolean categoryselected()
	{
		boolean b1=category.isDisplayed();
		return b1;
		
	}
	public boolean priceslected()
	{
		boolean b2=price.isDisplayed();
		return b2;
	}
	public boolean ratingselected()
	{
		boolean b3=rating.isDisplayed();
		return b3;
	}
	
	public boolean productdescription(WebDriver driver)
	{
		Set<String> pid=driver.getWindowHandles();
		Iterator<String> parentchildids=pid.iterator();
		String parentid=parentchildids.next();
		String childid=parentchildids.next();
		driver.switchTo().window(childid);
		boolean b3=description.isDisplayed();
		return b3;
	}

	public Amazon_SearchingFilter(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
}
