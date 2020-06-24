package popup_prgrms;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class p6
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disabled-notifications");
		options.addArguments("--disable-geolocation");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");
	}
		
}
	