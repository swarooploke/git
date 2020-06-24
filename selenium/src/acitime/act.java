//FETCHING LOCATION OF SCROLL AND SCROLLBAR OPERATIONS
package acitime;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class act
{

	static
	{	//SETS THE PATH FOR CHROME DRIVER EXECUTABLE
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		WebElement element = driver.findElement(By.xpath("(//a[text()='Start Using actiTIME'])[2]"));
		int x= element.getLocation().getX();
		int y=element.getLocation().getY();
		System.out.println(x+","+y);
		//converting one interface type to another interface
		JavascriptExecutor j =(JavascriptExecutor) driver;
		//it is used to scroll bar operations
		//j.executeScript("window.scrollBy(0,6000)");
		j.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(1000);
		
		
	}
}
		