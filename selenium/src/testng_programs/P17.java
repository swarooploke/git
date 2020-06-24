//to store the set of username using 2d array
package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P17
{
@DataProvider
public String[][] data()
{
	String[][] d = new String[2][2];
	// 3 sets of data repeated if [3][2] as trainee and 1234
	d[0][0]="admin";
	d[0][1]="manager";
	d[1][0]="trainee";
	d[1][1]="trainee";
	//d[2][0]="trainee";
	//d[2][2]="123";
	return d;
}
@Test(dataProvider = "data")
public void actitime_loginscript(String un,String pw) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pw);
	driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.close();
}
}
