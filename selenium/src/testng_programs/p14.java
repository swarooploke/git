package testng_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p14

{

@Test
	public void actitime_login() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		
		
		Thread.sleep(3000);
		//System.out.println(driver.getTitle());
		String title = driver.getTitle();
		Assert.assertEquals(title, "actiTIME - Enter Time-Track");
		//if(title.equals("actiTIME - Enter Time-Track"))
			//System.out.println("LOGIN - PASS");
		//else
			//System.out.println("LOGIN - FAIL");
		
	}
}
