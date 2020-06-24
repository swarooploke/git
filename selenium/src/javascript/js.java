//GIVEN FILE WRITING TO TEXTBOX AS USING IN CONSOLE document.getElementById(value).value='name'
package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js
{

	static
	{	//SETS THE PATH FOR CHROME DRIVER EXECUTABLE
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/seleniumprogs/first.html");
		JavascriptExecutor j =(JavascriptExecutor) driver;
		//type in console so this value given will display in textBox
		j.executeScript("document.getElementById('t1').value='sanjay'");
	}
}