//amazon using xPath
package own;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 
{
static
{
	System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
}

public static void main(String args[]) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone x r");
	driver.findElement(By.xpath("//input[@class='nav-input']")).click();
	driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).submit();
	driver.findElement(By.xpath("//input[@class='a-button-input']")).click();

}
}
