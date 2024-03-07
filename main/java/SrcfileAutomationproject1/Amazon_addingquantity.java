package SrcfileAutomationproject1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_addingquantity {
@FindBy(name="quantity")
WebElement quantity;
@FindBy(id="add-to-cart-button")
WebElement addcart;
@FindBy(xpath="//span[@id='sw-gtc']/span/a")
WebElement gocart;
@FindBy(xpath = "//input[@value='Delete']")
WebElement deletecart;
@FindBy(xpath = "//span[@id='sc-subtotal-label-activecart']")
WebElement carttotalitems;
@FindBy(xpath="//span[text()='Qty:']")
List<WebElement> cartitemnumber;
public void windowhandles(WebDriver driver)
{
	Set<String> id=driver.getWindowHandles();

	Iterator<String> id1=id.iterator();
	String parentid=id1.next();
	String childid=id1.next();
	driver.switchTo().window(childid);
}



public void addquantity()
{
	Select dd=new Select(quantity);
	dd.selectByValue("5");
}

public void addcart1()
{
	addcart.click();
}
public void gocart()
{
	gocart.click();
}
public boolean carttotallist()
{
	boolean b1=carttotalitems.isDisplayed();
	return b1;
}
public int cartitemnumber()
{
	int b2=cartitemnumber.size();
	return b2;
}
public void deletecartlist() {
	deletecart.click();
}
public Amazon_addingquantity(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
