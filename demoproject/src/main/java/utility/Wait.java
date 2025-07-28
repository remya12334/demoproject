package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static final int IMPLICITWAIT=10;
	public static final int EXPLICITWAIT=10;
	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
	   // wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
		 // --- Waits ---

	 public void waitForVisibility(WebDriver driver, WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }

	    public void waitForClickability(WebDriver driver, WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	    }

	    public void waitForPresence(WebDriver driver, By locator) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
	        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	    }

	    public void waitForInvisibility(WebDriver driver, By locator) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	    }
	}


