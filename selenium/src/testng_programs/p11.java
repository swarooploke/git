package testng_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class p11 extends Basetest
{
	@Test
	public void facebook_script() 
{
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("swarooploke@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("5901");
	driver.findElement(By.xpath("//label[@id='loginbutton']")).click();	
	
	
}
}

