package ap_progrms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login
{

	static
	{	//SETS THE PATH FOR CHROME DRIVER EXECUTABLE
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) throws Throwable,Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys(utility.getdata("sheet1",0,0));
		driver.findElement(By.name("pwd")).sendKeys(utility.getdata("sheet1",1,0));
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
	}
}