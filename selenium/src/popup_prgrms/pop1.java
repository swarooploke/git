package popup_prgrms;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class pop1
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./drive/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(1000);
		//identifies users and clicks
		driver.findElement(By.xpath("//div[@id='container_users']")).click();

		driver.findElement(By.xpath("//div[text()='  New User']")).click();
		Thread.sleep(1000);
		//identifies first name and sends data
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("123");
		Thread.sleep(1000);
		//clicks on close button
		driver.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.accept();
		//a.dismiss();
		String mes = a.getText();
		System.out.println(mes);
	}
}