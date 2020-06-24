package select_programs;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P3
{
static
{	//
	System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
}
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) throws Throwable
{
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Desktop/select.html");
	WebElement element = driver.findElement(By.id("empire"));
	
	Select s = new Select(element);
	List<WebElement> allopt = s.getOptions();
	
	ArrayList arr=new ArrayList<>();
	for(WebElement a:allopt)
	{
	String text = a.getText();
		arr.add(text);
	}
	System.out.println(arr);
	//Collections.sort(arr);
	Collections.sort(arr, Collections.reverseOrder());
	System.out.println(arr);

}
}