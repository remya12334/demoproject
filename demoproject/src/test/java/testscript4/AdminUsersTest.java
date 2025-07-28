package testscript4;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utility.ExcelUtility;
import utility.FakerUtility;
@Test
public class AdminUsersTest extends Base{

@Test
	public void validateuserisabletoaddAdmin() throws IOException
	{
	String username=ExcelUtility.getStringData(1,0,"LOGINPAGE");
	String password=ExcelUtility.getStringData(1,1,"LOGINPAGE");
	LoginPage loginPage = new LoginPage(driver);
    loginPage.enterUsername(username);
    loginPage.enterPassword(password);
    loginPage.clickSignin();
	
    AdminUsersPage adminuserspage=new AdminUsersPage(driver);
    adminuserspage.adminusersmoreinfo();
    adminuserspage.adminuserAddNew();
    //String username1=ExcelUtility.getStringData(1,0,"AdminAdd");
    //String password1=ExcelUtility.getStringData(1,1,"AdminAdd");
    FakerUtility fakerutility=new FakerUtility();
	String username1=fakerutility.creatARandomFirstName();
	String password1=fakerutility.creatARandomLastName();// 
    adminuserspage.enterUsername(username1);
    adminuserspage.enterPassword(password1);
    adminuserspage.dropdownSelect();
    adminuserspage.saveAdmin();
    Boolean alertdisplayed=adminuserspage.isgreenalertDisplayed();
    Assert.assertTrue(alertdisplayed);
    
	}
    
    
	
}
