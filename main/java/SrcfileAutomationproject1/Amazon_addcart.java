package SrcfileAutomationproject1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_addcart {
	WebDriver driver;
@FindBy(xpath="//*[contains(@class,'a-section a-spacing-base a-text-center')][1]")
WebElement productclick;
//(//*[contains(@class,'a-section a-spacing-base')])[1]
@FindBy(id = "add-to-cart-button")
WebElement addtocart;
public void product()
{
	
	productclick.click();	
}



public void windowhandles(WebDriver driver)
{
	Set<String> id=driver.getWindowHandles();

	Iterator<String> id1=id.iterator();
	String parentid=id1.next();
	String childid=id1.next();
	driver.switchTo().window(childid);
}

public void cart()
{
	addtocart.click();	
}
public boolean cartselect()
{
	boolean b4=addtocart.isDisplayed();
	return b4;
}
public Amazon_addcart(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
