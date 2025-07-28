package testscript4;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.ExcelUtility;

@Test
public class LoginTest extends Base {
	@Test(groups= {"regression"})
	public void verifyUserisabletologinwithValidCredentials() throws IOException
	{
		//String username="admin";
		//String password="admin";
		String username=ExcelUtility.getStringData(1,0,"LOGINPAGE");
		String password=ExcelUtility.getStringData(1,1,"LOGINPAGE");
		LoginPage loginpage=new LoginPage(driver);//we need to pass value from this page to login page.driver parameter is passed
		loginpage.enterUsername(username);//call 
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		Boolean isHomepageDisplayed=loginpage.isDashboardDisplayed();
		Assert.assertTrue(isHomepageDisplayed);
	}
	@Test(groups= {"regression"})
	public void verifyUserisabletologinwithInvalidUsername() throws IOException
	{
		//String username="admin000";
		//String password="admin";
		String username=ExcelUtility.getStringData(2,0,"LOGINPAGE");
		String password=ExcelUtility.getStringData(2,1,"LOGINPAGE");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		Boolean isLoginFailed=loginpage.isAlertDisplayed();
		Assert.assertTrue(isLoginFailed);
	}
	@Test(retryAnalyzer=retry.Retry.class)
	public void verifyuserisabletologinwithInvalidPassword()
	{
		String username="admin";
		String password="admin12";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		Boolean isLoginFailed=loginpage.isAlertDisplayed();
		Assert.assertTrue(isLoginFailed);
		
		
	}
	@Test
	public void verifyuserisabletologinwithInvalidUsernameandInvalidPassword()
	{
		String username="admin1234";
		String password="admin1234";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		Boolean isLoginFailed=loginpage.isAlertDisplayed();
		Assert.assertTrue(isLoginFailed);
	}

}
