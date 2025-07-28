package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtility {
	public void getScreenShot(WebDriver driver, String failedTestCase) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver; //Typecasting WebDriver to Take Screenshot
				//Treat the driver like a TakesScreenshot object.											
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);//getScreenshotAs is a method inside TakesScreenshot interface//click//Selenium's TakesScreenshot interface is used to capture screenshots.
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());//Creating Timestamp//date is a class to get currentdate
		//This creates a timestamp like 26_07_2025_09_30_45 so that each screenshot has a unique name.
		File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot"); 
		//System.getProperty("user.dir") gets your current project directory																			
																					
		if (!f1.exists()) {
			f1.mkdirs(); //make directory.//This creates a folder called OutputScreenShot if it doesn't already exist.
		}
		String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp
				+ ".png";  //creating final destination path
		File finalDestination = new File(destination);// creating file object//Creates a File object representing the final destination for the screenshot.
		FileHandler.copy(screenShot, finalDestination); //Copy Screenshot to Destination//filehandler class and copy method
		//Copies the temporary screenshot file to the final destination using FileHandler.
	}

}
