package utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility {
public WebDriver driver;
public JavascriptExecutor js;
public WebDriverWait wait;
//dropdown by visibleText
	public void selectByVisibleText(WebElement element, String visibleText)
	{
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
		
	}
	//dropdown by value
	
	public void selectByValue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	//dropdown by index
	public void selectByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	//draganddrop
	public void dragandDrop(WebElement source,WebElement target)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(source,target).build().perform();
	}
	//rightclick
	public void rightClick(WebElement target)
	{
		Actions action=new Actions(driver);
		action.contextClick(target).build().perform();
	}
	
	//mouseclick
	public void mouseClick(WebElement target)
	{
		Actions action=new Actions(driver);
		action.click(target).build().perform();
	}
	//doubleclick
	public void doubleClick(WebElement target)
	{
		Actions action=new Actions(driver);
		action.doubleClick(target).build().perform();
	}
	//radio button click
	 public void clickRadioButton1(WebElement radioButton)
	 {
	        if (radioButton.isDisplayed() ) 
	        {
	            radioButton.click();
	        }
	 }
	 //radiobutton click
	 public void clickRadioButton2(WebElement radioButton)
	 {
	        if (radioButton.isEnabled() ) 
	        {
	            radioButton.click();
	        }
	 }
	 //radiobutton click
	 public void clickRadioButton3(WebElement radioButton)
	 {
	        if (!radioButton.isSelected() ) 
	        {
	            radioButton.click();
	        }
	 }
	 
	 
    // Scroll to element
    public void scrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Click using JavaScript
    public void clickUsingJS(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    // Set value to an input field using JavaScript
    public void setValueUsingJS(WebElement element, String value) {
        js.executeScript("arguments[0].value='" + value + "';", element);
    }

    // Get value of an element using JavaScript
    public String getValueUsingJS(WebElement element) {
        return (String) js.executeScript("return arguments[0].value;", element);
    }

    // Scroll down by pixels
    public void scrollDownByPixels(int pixels) {
        js.executeScript("window.scrollBy(0," + pixels + ");");
    }

    // Scroll up by pixels
    public void scrollUpByPixels(int pixels) {
        js.executeScript("window.scrollBy(0,-" + pixels + ");");
    }

    // ----------- Alert Handling Methods -------------

    // Wait for alert to be present
    public void waitForAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
    }

    // Accept alert (click OK)
    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    // Dismiss alert (click Cancel)
    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    // Get alert message text
    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    // Send text to alert (prompt alert)
    public void sendTextToAlert(String inputText) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(inputText);
        alert.accept();
    }

}



