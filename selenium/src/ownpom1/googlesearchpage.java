//POM to class been organized in this acting as inheritance 
package ownpom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearchpage
{
		//declaring driver globally
	private static WebElement element = null;
		
	public static WebElement textbox_search(WebDriver driver)
	{
		element = driver.findElement(By.name("q"));
		return element;
		
	}
	public static WebElement button_search(WebDriver driver)
	{
		element = driver.findElement(By.name("btnK"));
		return element;
	}
}
