//AND THIS IS THE SCRIPT USED
package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.actitime_login;

public class login
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	actitime_login ob = new actitime_login(driver);
	ob.username.sendKeys("admin");
	ob.password.sendKeys("manager");
	ob.loginbutton.click();
}
}
