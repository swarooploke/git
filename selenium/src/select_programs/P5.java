package select_programs;



import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P5
{
static
{	//
	System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
}
@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
public static void main(String[] args) throws Throwable
{
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Desktop/select.html");
	WebElement element = driver.findElement(By.id("empire"));
	
	Select s = new Select(element);
	List<WebElement> allopt = s.getOptions();
	
	
	TreeSet arr = new TreeSet<>();
	for(WebElement a:allopt)
	{
	String text = a.getText();
		boolean cond= arr.add(text);
		
		}
		System.out.println(arr);
	}
	

}
