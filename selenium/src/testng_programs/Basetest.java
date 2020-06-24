package testng_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest {
	WebDriver  driver;
	
	@BeforeMethod
		public void presecond()
		{
			System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
			 driver =new ChromeDriver();
		}
	@AfterMethod
		public void postsecond()
		{
			driver.close();
		}

}
