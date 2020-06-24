package Mock_pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Mock_pom.login_script;
import ap_progrms.utility;

public class facebook
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
	WebDriver drive=new ChromeDriver();
	drive.get("https://www.facebook.com/");
	login_script ob1 =new login_script(drive);
	ob1.setusername(utility.getdata("sheet1", 0,0));
	ob1.setpassword(utility.getdata("sheet1", 1,0));
	ob1.setloginbutton();
	
	
	
}
}
