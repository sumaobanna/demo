package Ebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fetchdata {
	WebDriver d;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.gecko.driver","E:\\TYSS\\Project_1\\sss\\geckodriver.exe");
		 d=new FirefoxDriver();
		d.get("https://www.ebay.com/");
	}
	@Test
	public void data()
	{
		/* navigate to search and send the data*/
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("watches");
	
	}

}
