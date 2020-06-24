//PERFORMING DOUBLE CLICK USING ACTIONS
package actions_programs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ap2_programs
{

	static
	{	//SETS THE PATH FOR CHROME DRIVER EXECUTABLE
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) throws Throwable,Throwable 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Admin/Documents/seleniumprogs/doubleclick.html");
		WebElement text = driver.findElement(By.id("demo"));
		
		Actions a =new Actions(driver);
		a.doubleClick(text).perform();
	}
}