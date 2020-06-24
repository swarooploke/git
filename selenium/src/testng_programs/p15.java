package testng_programs;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p15

{

@Test
	public void actitime_login() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		//WebElement text = driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]"));
		//boolean cond = text.isDisplayed();
		//Assert.assertEquals(cond, true);
		//Assert.assertTrue(cond);
		//Assert.assertFalse(cond);
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBoxContainer"));
		boolean cond1 = checkbox.isSelected();
		Assert.assertTrue(cond1);
		
	}

}