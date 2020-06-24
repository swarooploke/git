//using action function performing MoveElement and fetching number
package actions_programs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ap1
{

	static
	{	//SETS THE PATH FOR CHROME DRIVER EXECUTABLE
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) throws Throwable,Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		
		WebElement element = driver.findElement(By.xpath("(//a[@id='navbarDocumentation'])[2]"));
		
		//int x = element.getLocation().getX();
		//int y = element.getLocation().getY();
		
		//Robot r =new Robot();
		//r.mouseMove(x, y);
		
		Actions a =new Actions(driver);
		a.moveToElement(element).perform();
		driver.findElement(By.xpath("(//a[@class='d-flex align-items-center text-decoration-none'])[9]")).click();
		WebElement phno = driver.findElement(By.xpath("//p[text()='+91 9243602352']"));
		System.out.println(phno.getText());
				
		
	}
}