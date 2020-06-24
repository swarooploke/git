package webelement;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class p7{
	static
	{
		//set the path for the chrome driver executable 
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
	}
}