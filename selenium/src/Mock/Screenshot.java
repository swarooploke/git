package Mock;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot
{
static
{
	System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
}
public static void main(String[] args) throws Throwable
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.qspiders.com/");
	TakesScreenshot t=(TakesScreenshot) driver;
	File source=t.getScreenshotAs(OutputType.FILE);
	File destination = new File("./screenshot/Qspider.tiff");
	FileUtils.copyFile(source, destination);
}
}

