package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="(//div[@class='_2aUbKa'])[1]")
	private WebElement My_account;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void account()
	{
		
	}

}
