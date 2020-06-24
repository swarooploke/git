package testng_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p3

{
@Test
public void actitime_login()
{
	System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
	driver.close();
	
}
@Test
public void facebook_script() 
{
	System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("swarooploke@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("5901");
	driver.findElement(By.xpath("//label[@id='loginbutton']")).click();	
	
	driver.close();
}
}