package SrcfileAutomationproject1;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_EditProfile {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Account & Lists']")
	WebElement accounts;
	@FindBy(xpath="//span[.='Manage Profiles']")
	WebElement editprofile;
	@FindBy(xpath="//a[.='View']")
	WebElement viewprofile;
	@FindBy(xpath="//span[@class='editProfile']")
	WebElement editname;
	@FindBy(xpath="//input[@id='editProfileNameInputId']")
	WebElement editProfileNam;
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement continuesbutton;
	@FindBy(xpath="//span[contains(text(),'Hello, Thaarakeswari')]")
	WebElement correctmessage;
	public void accountmanage(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accounts).perform();
	}
	public void editpage()
	{
		editprofile.click();
	}
	public void view()
	{
		viewprofile.click();
	}
	public void editnamedisplay()
	{
		editname.click();
	}
	public void editProfileNam()
	{
	
		editProfileNam.sendKeys(Keys.CONTROL+("A"));
		editProfileNam.sendKeys(Keys.DELETE);
		editProfileNam.sendKeys("ThaarakeswariS");
	}
	public void continuesbuttons()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(continuesbutton)); 
		continuesbutton.click();
	}
	public String message()
	{
		String name=correctmessage.getText();
		return name;
	}
	public Amazon_EditProfile (WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
}
