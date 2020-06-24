//same as amazon program gettext and price range
package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class p7
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("woodlands");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(10000);
		List <WebElement> shoesname= driver.findElements(By.xpath("//a[@class='_2mylT6']"));
		List <WebElement> price= driver.findElements(By.xpath("//a[@class='_2mylT6']/..//div[@class='_1vC4OE']"));
		
		for(int i=0;i<price.size();i++)
			
		{
			String p1 = price.get(i).getText();
			String p2 = p1.substring(1).replaceAll(",", "");
			int p3= Integer.parseInt(p2);
			if(p3<2000)
			{
			
			System.out.println(shoesname.get(i).getText()+"="+price.get(i).getText());
		}
		
	}

}
}