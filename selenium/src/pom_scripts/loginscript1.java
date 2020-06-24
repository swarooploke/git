package pom_scripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ap_progrms.utility;
import pom.actitimelogin;
public class loginscript1 
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	
	actitimelogin ob =new actitimelogin(driver);
	ob.setusername(utility.getdata("sheet1",0,0));
	ob.setpassword(utility.getdata("sheet1", 1, 0));
	ob.clicklogin();
	ob.clicklogout();
}
}
