package SrcfileAutomationproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Proceedtobuy {
	WebDriver driver;
@FindBy(xpath="(//span[@class='a-button-inner']/input)[1]")
WebElement buy;
public void proceedtobuy()
{
	buy.click();
}
public boolean proceedtobuy1()
{
	boolean b1=buy.isDisplayed();
	return b1;
}
public Amz_Proceedtobuy(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
 