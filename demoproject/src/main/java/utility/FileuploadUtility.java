package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;

public class FileuploadUtility {
	
	public void fileuploadusingSendKeys(WebElement element,String path)
	{
		element.sendKeys(path);
	}

	public void fileuploadusingRobotClass(WebElement element,String path) throws AWTException
	{
		
		StringSelection s=new StringSelection(path); //stringselection(class) is used to copy path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);//TOOLKIT CLASS AND OTHER METHODS,to get the systems clipboard
		Robot r=new Robot();// this is created to simulate keyboard/mouse actions-Robot class
		r.delay(2500);//TIME TO COPY PASTE
		r.keyPress(KeyEvent.VK_CONTROL);//METHOD IN ROBOT CLASS,VK IS VIRTUAL CONTROL
		r.keyPress(KeyEvent.VK_V);
	//control+v press	
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	//control+v release	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
	
