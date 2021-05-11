package Test_scripts;
import org.testng.annotations.Test;

import generic.Generic;
import junit.framework.Assert;
import pom.LoginPage;

public class loginTest extends Generic {
  LoginPage lp=new LoginPage(d);
	
	@Test
	public void login() throws Exception
	{
		lp.setusername("suma");
		lp.setpwd("****");
		lp.clicklogin();
		String title = d.getCurrentUrl();
		Assert.assertTrue(title.contains("https://www.flipkart.com/")); 
		
	}
	
	@Test
	public void validateerrorMSGInlogin() throws Exception
	{
		lp.setusername("suma");
		lp.setpwd("****");
		lp.clicklogin();
		lp.geterrorMsg(); 
		
	}
  

}
