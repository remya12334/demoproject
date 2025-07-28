package testscript4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


	public class Login extends Base{
		@Test
	public void loginTest1()
	{
			String uname="admin";
			String pwd="admin";
			WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys(uname);
			WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys(pwd);
			WebElement signin=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
			signin.click();
			WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']"));//to check whether login happens,we need to identify something from home
			Boolean expvalue=dashboard.isDisplayed();// to check whether dashboard is displayed,it return a true or false value.so store it in a boolean variable.
			Assert.assertTrue(expvalue);
		
	}
		@Test
		public void loginTest2()
		{	
			String uname="admin000";
		String pwd="admin";
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(uname);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pwd);
		WebElement signin=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		signin.click();
		WebElement alert1=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));//here we inspect that red alert
		Boolean expvalue=alert1.isDisplayed();// we need to display that alert,then testcase passes
		Assert.assertTrue(expvalue);
			
		}
		@Test
		public void loginTest3()
		{
			String uname="admin";
			String pwd="admin12";
			WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys(uname);
			WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys(pwd);
			WebElement signin=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
			signin.click();
			WebElement alert1=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			Boolean expvalue=alert1.isDisplayed();
			Assert.assertTrue(expvalue);
				
		}
		
	
		@Test
		public void loginTest4()
		{
			String uname="admin1234";
			String pwd="admin1234";
			WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys(uname);
			WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys(pwd);
			WebElement signin=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
			signin.click();
			WebElement alert1=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			Boolean expvalue=alert1.isDisplayed();
			Assert.assertTrue(expvalue);
				
		}
		
	}

