//USING ROBOT METHOD  SO USING AUTOMATICALLY KEY PRESS KEY RELEASE IS BEEN USED
package ap_progrms;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action
{

	static
	{	
		//SETS THE PATH FOR CHROME DRIVER EXECUTABLE
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
		
	}

	public static void main(String[] args) throws Throwable,Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		//right clicks on the WebElement
		Actions a =new Actions(driver);
		//RightClick operation
		
		a.contextClick(link).perform();
		Thread.sleep(1000);
		
		//opens link in new tab
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_W);
		r.keyPress(KeyEvent.VK_W);
		
		
		
	}
}