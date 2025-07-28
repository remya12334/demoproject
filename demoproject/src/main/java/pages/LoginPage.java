package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@name='username']") WebElement username;//pagefactory is used to find webelement,@FindBy is provided by page factory
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']") WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;// used to automate login page
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alert1;
	public WebDriver driver;//globally created
	public LoginPage(WebDriver driver) {
//we need to pass our parameter,so constructor is needed ,this driverparameter is local,so we need to create a global parameter
		this.driver=driver;
		PageFactory.initElements(driver,this);//pagefactory class ,method initElements()->used to initialize webelements,static method(classname.methodname)
	//(driver,this)--> means this class driver
	}
	public void enterUsername(String username2)
	{
		username.sendKeys(username2);
	}
	public void enterPassword(String password2)
	{
		password.sendKeys(password2);
	}
	public void clickSignin()
	{
		signin.click();
	}
	
	public boolean isDashboardDisplayed()
	{
		return dashboard.isDisplayed();
	}
	public boolean isAlertDisplayed()
	{
		return alert1.isDisplayed();
	}

}
