package testng_programs;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import ap_progrms.utility;
import pom.actitimelogin;


public class p10 extends Basetest
{
	@Test
	public void actitime_login() throws Throwable
{
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	actitimelogin ob =new actitimelogin(driver);
	ob.setusername(utility.getdata("sheet1", 0, 0));
	ob.setpassword(utility.getdata("sheet1", 1, 0));
	ob.clicklogin();

}

}
