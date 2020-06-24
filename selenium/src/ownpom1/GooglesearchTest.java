//main function of POM
package ownpom1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglesearchTest
{
private static WebDriver driver = null;
public static void main(String[] args)
{
	googleSearch();
}
public static void googleSearch()
{
	System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://google.com");
	googlesearchpage.textbox_search(driver).sendKeys("Automation Step By Step");
	googlesearchpage.button_search(driver).sendKeys(Keys.RETURN);
	driver.close();
	System.out.println("Test Completed Succesfully");
}
}
