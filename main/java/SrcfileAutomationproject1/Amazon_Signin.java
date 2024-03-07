package SrcfileAutomationproject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import fetchingDataexcel_amazonquestion.testdata;


public class Amazon_Signin extends testdata {
	
	WebDriver driver;
@FindBy(xpath="//span[text()='Account & Lists']")
WebElement accounts;
@FindBy(xpath="//span[.='Sign in']")
WebElement signinbutton;
@FindBy(id="ap_email")
WebElement email;
@FindBy(id="continue")
WebElement continuebutton;
@FindBy(id="ap_password")
WebElement pwdenter;
@FindBy(id="signInSubmit")
WebElement finalsignin;
@FindBy(xpath="//span[contains(text(),'Hello, Thaarakeswari')]")
WebElement correctmessage;
@FindBy(xpath="/span[contains(text(),'Your password is incorrect')]")
WebElement incorrectpwdmsg;
public void accountandlist(WebDriver driver)
{
	Actions a1=new Actions(driver);
	a1.moveToElement(accounts).perform();
	
}
public void signin()
{
	signinbutton.click();
	
}
public void mail()
{
	email.sendKeys(phno);
}
public void mail1()
{
	email.sendKeys(emailincorrect);
}
public void button()
{
	continuebutton.click();
}
public void password ()
{
	pwdenter.sendKeys(pwd);;
}
public void password2()
{
	pwdenter.sendKeys(password1incorrect);;
}
public void finalsubmit()
{
	
	
	finalsignin.click();
}
public String message()
{
	String name=correctmessage.getText();
	return name;
}
public String wrongmessage()
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(incorrectpwdmsg));
	String name1=incorrectpwdmsg.getText();
	return name1;
}

public Amazon_Signin(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
