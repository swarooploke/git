package popup_prgrms;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pop3
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/seleniumprogs/prompt.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		
		WebDriverWait wait=  new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("swaroop");
		a.accept();
		
		
	}
}