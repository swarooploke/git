//AND THIS IS THE SCRIPT USED
package pom_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.actitime_entertt;
import pom.actitime_login;
import pom.fn_ln_logout;


public class entertt
{

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	
	//First script
	actitime_login ob =new actitime_login(driver);
	ob.username.sendKeys("admin");
	ob.password.sendKeys("manager");
	ob.loginbutton.click();
	Thread.sleep(4000);
	
	//Second script
	actitime_entertt ob2 = new actitime_entertt(driver);
	ob2.users.click();
	ob2.user.click();
	Thread.sleep(5000);
	
	
	//Third script
	fn_ln_logout ob3=new fn_ln_logout(driver);
	ob3.firstname.sendKeys("sanjay");
	ob3.middlename.sendKeys("m");
	ob3.lastname.sendKeys("l");
	ob3.email.sendKeys("loke20@gmail.com");
	ob3.submit.click();
	ob3.close.click();
	ob3.logoutbutton.click();
	
	
	}
}
	
	
