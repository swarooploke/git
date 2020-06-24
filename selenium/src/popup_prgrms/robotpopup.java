package popup_prgrms;


import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class robotpopup
{
static
	{
		System.setProperty("webdriver.gecko.driver","./drive/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException  , Throwable 
	{
			//driver for firefox
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}
}
		
		
		