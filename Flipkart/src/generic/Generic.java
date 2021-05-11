package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Generic {
	public WebDriver d;
	static
	{
		
		System.setProperty("webdriver.chrome.driver", "E:/CRM/Flipkart/software/chromedriver.exe");
	}

	@BeforeMethod
	public void openapp() throws InterruptedException {
	
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(5000);
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}

	@AfterMethod
	public void closeapp() {
		d.quit();
	}
}
