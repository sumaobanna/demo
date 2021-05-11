package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginPage {
	@FindBy(xpath="//input[@type='text'] ")
	private WebElement untbox;
	@FindBy(xpath="//input[@type='password'] ")
	private WebElement pwdbox;
	@FindBy(xpath="(//span[.='Login'] )[3]")
	private WebElement login;
	@FindBy(xpath="//span[text()='Please enter valid Email ID/Mobile number']")
	private WebElement errormsg;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setusername(String un) throws Exception
	{
		Thread.sleep(3000);
		untbox.sendKeys(un);
	}
	public void setpwd(String pwd) throws Exception
	{
		Thread.sleep(3000);
		pwdbox.sendKeys(pwd);
	}
	public void clicklogin()
	{
		login.click();
	}
	

public void geterrorMsg()
{
	String text = errormsg.getText();
	Assert.assertTrue(text.contains("Please enter valid Email ID/Mobile number"));
}


}
