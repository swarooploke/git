package select_programs;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P2 
{
static
{	//
	System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
}
public static void main(String[] args) throws Throwable
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement day = driver.findElement(By.id("day"));
	Select s1= new Select(day);
	s1.selectByValue("1");

	WebElement month = driver.findElement(By.id("month"));
	Select s2= new Select(month);
	s2.selectByValue("8");
	
	WebElement year = driver.findElement(By.id("year"));
	Select s3= new Select(year);
	s3.selectByValue("1979");



	}
}

