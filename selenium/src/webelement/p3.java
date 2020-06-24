package webelement;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class p3{
	static
	{
		//set the path for the chrome driver executable 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement	element=driver.findElement(By.xpath("//a[text()='Create a Page']"));
	//to find out webelement is diplayed or not
System.out.println(element.isDisplayed());
//whthwe to find out link is there or not
String tagname = element.getTagName();
 
if(tagname.equals("a"))
	System.out.println("it is a link");
else
	System.out.println("it is not a link");

	}
}
