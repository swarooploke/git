//SCROLLIMG OPTION BY USING JAVASCRIPTEXECUTOR SCROLLING OPTION USING WINDOWS.SCROLL BY
package amazonown;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class amazon1
{

	static
	{	//SETS THE PATH FOR CHROME DRIVER EXECUTABLE
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("adidas");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_1']")).click();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//windows.scrollBy are been taken by console
		j.executeScript("window.scrollBy(0,20)");
		j.executeScript("window.scrollBy(0,40)");
		j.executeScript("window.scrollBy(0,60)");
		j.executeScript("window.scrollBy(0,90)");
		j.executeScript("window.scrollBy(0,150)");
	
	}
}