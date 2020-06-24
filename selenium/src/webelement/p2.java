package webelement;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class p2{
	static
	{
		//set the path for the chrome driver executable 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("//input[@id='email']"));
		//clears the data into textbox
		username.sendKeys("12345");
		//username.clear();
		//alternative commond to clear data into textbox
		//username.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		//by using javascript executor to clear text
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("document.getElementById('email').value=''");
	}
}
		