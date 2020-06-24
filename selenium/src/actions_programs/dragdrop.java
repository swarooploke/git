//action example for drop and down
package actions_programs;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//this is main package should import
import org.openqa.selenium.interactions.Actions;

public class dragdrop 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException, AWTException
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement block4=driver.findElement(By.xpath("//h1[text()='Block 4']"));
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.clickAndHold(block1).release(block4).perform();
}
}
