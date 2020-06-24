package webelement;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4{
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
		//whther to find out text box is enabled or disabled
		System.out.println(username.isEnabled());
		//to find attribute value 
		System.out.println(username.getAttribute("type"));
		System.out.println(username.getAttribute("data-testid"));
		
		
	}
}