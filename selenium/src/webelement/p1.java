package webelement;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1{
	static
	{
		//set the path for the chrome driver executable 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("//input[@id='email']"));
		WebElement password = driver.findElement(By.id("//input[@id='pass']"));
		int h1 = username.getSize().getHeight();
		int w1 = username.getSize().getWidth();
		int h2 = password.getSize().getHeight();
		int w2 = password.getSize().getWidth();
		if(h1==h2&&w1==w2)
			System.out.println("same dimension");
		else
			System.out.println("different dimension");
		System.out.println(h1);
		System.out.println(w1);
		
		
}
}