package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utility.PageUtility;

public class AdminUsersPage {
    @FindBy(xpath="//a[@class='small-box-footer']") WebElement moreinfo;
	//@FindBy(xpath="//a[contains(text(),'More info')]") WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newbutton;
	@FindBy(xpath="//input[@id='username']") WebElement uname;
	@FindBy(xpath="//input[@id='password']")WebElement pword;
	@FindBy(xpath="//select[@id='user_type']") WebElement usertypedropdown;
	@FindBy(xpath="//button[@type='submit' and @name='Create']") WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement greenalert;
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void adminusersmoreinfo()
	{
		moreinfo.click();
		
	}
	public void adminuserAddNew()
	{
		newbutton.click();
	}
	
	public void enterUsername(String name)
	{
		uname.sendKeys(name);
	}
	
	public void enterPassword(String password)
	{
		pword.sendKeys(password);
	}
	public void dropdownSelect()
	{
		//Select s=new Select(usertypedropdown);
		//s.selectByVisibleText("Admin");
		PageUtility pageutility=new PageUtility();
		pageutility.selectByVisibleText(usertypedropdown,"Admin");
	}
	
	public void saveAdmin()
	{
		save.click();
	}
	public boolean isgreenalertDisplayed()
	{
		return greenalert.isDisplayed();
	}
	
}
