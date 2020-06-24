//GET TEXT OF PRICE GIVEN RANGE BELOW USING LIST 
package amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class a1
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
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<WebElement> shoes = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		Thread.sleep(30000);
		
		for(int i=0;i<price.size();i++)
		{
			String p1 = price.get(i).getText();
			String p2 = p1.substring(1).replaceAll(",", "");
			int p3= Integer.parseInt(p2);
			if(p3<2000)
			{
				System.out.println(shoes.get(i).getText()+"="+price.get(i).getText());
				
			}
		}
		}
}
