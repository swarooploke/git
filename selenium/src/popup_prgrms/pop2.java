package popup_prgrms;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class pop2
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Documents/seleniumprogs/alert.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		a.accept();
	}
}