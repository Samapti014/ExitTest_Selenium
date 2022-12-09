package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	public static void ScreenShot(WebDriver driver , String filename) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver ;
		File output = new File(System.getProperty("user.dir") + "\\Test_Screenshots\\" + filename + ".png");
		
		FileUtils.copyFile(screenshot.getScreenshotAs(OutputType.FILE) , output);
	}
}
