package select_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1 
{
static
{	//
	System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
}
public static void main(String[] args) throws Throwable
{
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Desktop/select.html");
	WebElement element = driver.findElement(By.id("empire"));
	
	Select s = new Select(element);
	s.selectByIndex(0);
	s.selectByValue("d");
	s.selectByVisibleText("Tandoori");
	Thread.sleep(3000);
	
	
//	s.deselectByIndex(0);
	//s.deselectByValue("d");
	//s.deselectByVisibleText("Tandoori");
	//s.deselectAll();
	
	WebElement fo = s.getFirstSelectedOption();
	System.out.println(fo.getText());
	
	List<WebElement> all = s.getAllSelectedOptions();
	for(WebElement a:all)
	{
		System.out.println(a.getText());
	}
}
}
