package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x1
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("swarooploke@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9945901411");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
	}

}
