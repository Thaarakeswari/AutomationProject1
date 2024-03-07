package SrcfileAutomationproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class Amazon_searchproducts {
	WebDriver driver;
@FindBy(id="twotabsearchtextbox")
WebElement search;
@FindBy(id="nav-search-submit-button")
WebElement search1;
@FindBy(xpath="//div[@class='a-section a-spacing-base a-text-center'][1]")
WebElement search2;
public void searchproducts(String s1)
{
	search.sendKeys(s1);
	
}
public void searchproducts1()
{
	search.sendKeys("shoes");
	
}
public void search()
{
	search1.click();
	
}
public void search2()
{
	search2.click();
	
}
public boolean productsdisplay()
{
	boolean b=search1.isDisplayed();
	return b;
}
public Amazon_searchproducts(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
